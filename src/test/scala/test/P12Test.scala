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

import test.P12._

class P12Test extends FlatSpec with ShouldMatchers with Checkers {
  
  it should "return Nil if list is Nil" in {
    List[(Int, Any)]().decode should be (Nil)
  }
  
  it should "return ('a) if the list is ((1, 'a))" in {
    List((1, 'a)).decode should be (List('a))
  }
  
  it should "return ('a, 'a, 'b) if the list is (2, 'a), (1, 'b)" in {
    List((2, 'a), (1, 'b)).decode should be (List('a, 'a, 'b))
  }
}