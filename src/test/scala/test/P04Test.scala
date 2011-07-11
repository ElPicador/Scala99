package test

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

import org.scalacheck.Prop
import org.scalacheck.Prop._
import org.scalacheck.Arg
import org.scalatest.prop.Checkers._
import org.scalacheck.Arbitrary.arbitrary

class P04Test extends FlatSpec with ShouldMatchers {
  
  it should "validate the property" in {    
    check( Prop.forAll { (list: List[Int]) => (list.length == P04.length(list))
    })
  }
    
  it should "get the length" in {
    val list = List(1, 2, 3, 4, 5)
    P04.length(list) should equal (5)
    
    val emptyList = List[Int]()
    P04.length(emptyList) should equal (0)
  }
  
}