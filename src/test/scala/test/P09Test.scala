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


class P09Test extends FlatSpec with ShouldMatchers with Checkers {
  
  it should "validate the property" in {    
    //TODO
  }
  
  it should "do nothing on a simple list" in {
    P09.pack(Nil) should equal (List(List()))
    
    val list = List(1, 2, 3, 4)
    P09.pack(list) should equal (List(List(1), List(2), List(3), List(4)))
  }
  
  it should "pack a complex list" in {
    val list = List(1, 2, 2, 3, 3, 3, 2)
    P09.pack(list) should equal (List(List(1), List(2, 2), List(3, 3, 3), List(2)))
  }
  
  it should "pack the exemple" in {
    val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    P09.pack(list) should equal (List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e)))
  }

}