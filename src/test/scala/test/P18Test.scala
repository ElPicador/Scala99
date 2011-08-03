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

import test.P18._

class P18Test extends FlatSpec with ShouldMatchers with Checkers {
  
  it should "return Nil if list is Nil" in {
    Nil.mySlice(1, 1) should be (Nil)
  }
  
  it should "return the list if start > list.length" in {
    List(1).slice(10, 11) should be (List())
  }
  
  it should "return the list if start == end" in {
    List(1, 2).mySlice(10, 10) should be (List())
  }
  
  it should "return the slice" in {
    List(1, 2).slice(0, 1) should be (List(1))
  }
  
  it should "pass this test" in {
    List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k).mySlice(3, 7) should be (List('d, 'e, 'f, 'g))
  }
  
}
