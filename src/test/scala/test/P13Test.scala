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

import test.P13._

class P13Test extends FlatSpec with ShouldMatchers with Checkers {
  
  it should "return Nil if list is Nil" in {
    List[Any]().encodeDirect should be (Nil)
  }
  
  it should "return ((1, 'a)) if the list is ('a)" in {
    List('a).encodeDirect should be (List((1, 'a)))
  }
  
  it should "return ((1, 'a), (2, 'b)) if the list is ('a, 'b)" in {
    List('a, 'b).encodeDirect should be (List((1, 'a), (1, 'b)))
  }
  
  it should "return ((1, 'a), (3, 'b), (1, 'c)) if the list is ('a, 'b, 'b, 'b, 'c)" in {
    List('a, 'b, 'b, 'b, 'c).encodeDirect should be (List((1, 'a), (3, 'b), (1, 'c)))
  }

}