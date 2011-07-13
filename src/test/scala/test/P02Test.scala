package test

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import org.scalatest.prop.Checkers

import org.scalacheck.Prop
import org.scalacheck.Prop._
import org.scalacheck.Arg
import org.scalatest.prop.Checkers._
import org.scalacheck.Arbitrary.arbitrary

class P02Test extends FlatSpec with ShouldMatchers {
  
  it should "validate the property" in {
    check( Prop.forAll { list: List[Int] => (list.length > 1) ==> (list.reverse.tail.head == P02.penultimate(list)) } )
  }
  
  it should "get the penultieme element" in {
    val list = List(1, 2, 3, 4, 5)
    P02.penultimate(list) should equal (4)
    
    val list2 = List(1, 2)
    P02.penultimate(list2) should equal (1)
  }
  
  it should "throw exception" in {
    intercept[NoSuchElementException] {
      P02.penultimate(List())
    }
    
    intercept[NoSuchElementException] {
      P02.penultimate(List(1))
    }
  }
  
  
}