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

import test.P16._

class P16Test extends FlatSpec with ShouldMatchers with Checkers {
  
  it should "return Nil if list is Nil" in {
    Nil.myDrop(1) should be (Nil)
  }
  
  it should "return the List if drop >= list.length" in {
    List(1).myDrop(2) should be (List(1))
  }
  
  it should "drop if drop = 1 and list = List(1)" in {
    List(1).drop(1) should be (List())
  }
  
  it should "pass this test" in {
    List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k).myDrop(3) should be (List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))
  }
  
}