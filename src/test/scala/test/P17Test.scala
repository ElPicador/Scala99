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

import test.P17._

class P17Test extends FlatSpec with ShouldMatchers with Checkers {
  
  it should "return (Nil, Nil) if list is Nil" in {
    List().split(1) should be (Nil, Nil)
  }
  
  it should "return (list, Nil) if the length >= list.length" in {
    List(1).split(2) should be (List(1), Nil)
  }
  
  it should "return (List(1), List(2)) if entry is 1, List(1, 2)" in {
    List(1, 2).split(1) should be (List(1), List(2))
  }
    
  it should "pass this test" in {
    List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k).split(3) should be ((List('a, 'b, 'c), List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }
  
}
