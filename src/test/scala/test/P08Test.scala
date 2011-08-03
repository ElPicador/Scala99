package test

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.prop.Checkers

import org.scalacheck.Prop
import org.scalacheck.Prop._
import org.scalacheck.Arg
import org.scalacheck.Gen
import org.scalatest.prop.Checkers._
import org.scalacheck.Arbitrary.arbitrary


class P08Test extends FlatSpec with ShouldMatchers with Checkers {
  
  it should "validate the property" in {    
    val genIntList = Gen.containerOf[List, Int](Gen.frequency((1, 1), (2, 2), (3, 3)))
    check( Prop.forAll(genIntList) { list: List[Int] => 
      val a = P08.compress(list)
      (for {
        i <- 0 to (a.length-2)
        n = a(i)
        n_1 = a(i + 1)
        if n == n_1
      } yield n).isEmpty
    })
  }
  
  it should "do nothing on a simple list" in {
    P08.compress(List()) should equal (List())    
    
    val list = List(1, 2, 3, 4)
    P08.compress(list) should equal (list)
  }
  
  it should "flatten a complex list" in {
    val list = List(1, 2, 2, 3, 3, 3)
    P08.compress(list) should equal (List(1, 2, 3))
  }

}