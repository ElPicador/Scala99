package test

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.prop.Checkers

import org.scalacheck.Prop
import org.scalacheck.Arg
import org.scalatest.prop.Checkers._

class P05Test extends FlatSpec with ShouldMatchers with Checkers {
  
  it should "validate the property" in {
    check( Prop.forAll { ( list: List[String] ) => P05.reverse(P05.reverse(list)) == list } )
  }

  it should "reverse the nil list" in {
    val list = Nil
    P05.reverse(list) should equal (Nil)
  }
  
  it should "reverse the empty list" in {
    val list = List()
    P05.reverse(list) should equal (list)
  }

  it should "reverse a list with one element" in {
    val list = List("r")
    P05.reverse(list) should equal (list)
  }
  
  it should "reverse a list more than one element" in {
    val list = List(1, 2, 3, "r")
    P05.reverse(list) should equal (List("r", 3, 2, 1))
  }
  
}