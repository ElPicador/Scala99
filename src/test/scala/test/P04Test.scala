package test

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

import org.scalacheck.Prop
import org.scalacheck.Prop._
import org.scalacheck.Arg
import org.scalatest.prop.Checkers._
import org.scalacheck.Arbitrary.arbitrary

import test.MyList._


class P04Test extends FlatSpec with ShouldMatchers {
  
  it should "validate the property" in {    
    check( Prop.forAll { (list: List[Int]) => (list.length == list.myLength)
    })
  }
    
  it should "get the length" in {
    List(1, 2, 3, 4, 5).myLength should equal (5)
    
    Nil.myLength should equal (0)
  }
  
}