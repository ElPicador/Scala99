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

import test.P11._

class P11Test extends FlatSpec with ShouldMatchers with Checkers {
  
  it should "return Nil if list is Nil" in {
    List[Any]().encode should be (Nil)
  }
  
  it should "return ('a) if the list is ('a)" in {
    List('a).encode should be (List('a))
  }
  
  it should "return ((2, 'a)) if the list is ('a, 'a)" in {
    List('a, 'a).encode should be (List((2, 'a)))
  }
  
  it should "return ('a, (3, 'b), 'c) if the list is ('a, 'b, 'b, 'b, 'c)" in {
    List('a, 'b, 'b, 'b, 'c).encode should be (List('a, (3, 'b), 'c))
  }
  
}