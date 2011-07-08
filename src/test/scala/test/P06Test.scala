package test

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.prop.Checkers

import org.scalacheck.Prop
import org.scalacheck.Prop._
import org.scalacheck.Arg
import org.scalatest.prop.Checkers._
import org.scalacheck.Arbitrary.arbitrary


class P06Test extends FlatSpec with ShouldMatchers with Checkers {
  
  it should "validate the property" in {
    check( Prop.forAll { list: List[String] => (list.reverse == list) == P06.isPalindrome(list) } )
    check( Prop.forAll { list: List[String] => (list.reverse == list) => P06.isPalindrome(list) } )
    // check( Prop.forAllNoShrink(arbitrary[List[Int]])(list => (list.reverse != list) ==> !P06.isPalindrome(list)))
  }

  // it should "be true if list empty" in {
  //   val list = List()
  //   P06.isPalindrome(list) should equal (true)
  // }
  // 
  // it should "be true if list has one element" in {
  //   val list = List(1)
  //   P06.isPalindrome(list) should equal (true)
  // }
  // 
  // it should "be false if list is List(1, 2)" in {
  //   val list = List(1, 2)
  //   P06.isPalindrome(list) should equal (false)
  // }
  // 
  // it should "be true if list is List(1, 1)" in {
  //   val list = List(1, 1)
  //   P06.isPalindrome(list) should equal (true)
  // }
  // 
  // it should "be true if list is List(1, 2, 1)" in {
  //   val list = List(1, 2, 1)
  //   P06.isPalindrome(list) should equal (true)
  // }
  // 
  // it should "be true if list is List(1, 2, 2, 1)" in {
  //   val list = List(1, 2, 2, 1)
  //   P06.isPalindrome(list) should equal (true)
  // }
  //   

}