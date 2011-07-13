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

import test.P14._

class P14Test extends FlatSpec with ShouldMatchers with Checkers {
  
  it should "return Nil if list is Nil" in {
    List[Any]().duplicate should be (Nil)
  }
  
  it should "return (1, 1) if the list is (1)" in {
    List(1).duplicate should be (List(1, 1))
  }
  
  it should "return (2, 2, 2, 2) if the list is (2, 2)" in {
    List(2, 2).duplicate should be (List(2, 2, 2, 2))
  }
}