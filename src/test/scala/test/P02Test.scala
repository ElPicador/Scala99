package test

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.prop.Checkers

import org.scalacheck.Prop
import org.scalacheck.Prop._
import org.scalacheck.Arg
import org.scalatest.prop.Checkers._
import org.scalacheck.Arbitrary.arbitrary

import test.MyList._

class P02Test extends FlatSpec with ShouldMatchers {
  
  it should "validate the property" in {
    check( Prop.forAll { list: List[Int] => (list.length > 1) ==> (list.reverse.tail.head == list.penultimate) } )
  }
  
  it should "get the penultieme element" in {
    List(1, 2, 3, 4, 5).penultimate should equal (4)
    
    List(1, 2).penultimate should equal (1)
  }
  
  it should "throw exception" in {
    intercept[NoSuchElementException] {
      Nil.penultimate
    }
    
    intercept[NoSuchElementException] {
      List(1).penultimate
    }
  }
  
  
}