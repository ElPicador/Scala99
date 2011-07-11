package test

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.prop.Checkers

import org.scalacheck.Prop
import org.scalacheck.Prop._
import org.scalacheck.Arg
import org.scalatest.prop.Checkers._
import org.scalacheck.Arbitrary.arbitrary


class P07Test extends FlatSpec with ShouldMatchers with Checkers {
  
  it should "validate the property" in {    
    
  }
  
  it should "do nothing on a simple list" in {
    P07.flatten(Nil) should equal (Nil)
    
    P07.flatten(List()) should equal (List())    
    
    val list = List(1, 2, 3, 4)
    P07.flatten(list) should equal (list)
  }
  
  it should "flatten a complex list" in {
    val list = List(1, 2, List(3, 4))
    P07.flatten(list) should equal (List(1, 2, 3, 4))
  }
  
  it should "flatten a very complex list" in {
    val list = List(1, 2, List(3, 4), List(5, List(6, 7)))
    P07.flatten(list) should equal (List(1, 2, 3, 4, 5, 6, 7))
  }

}