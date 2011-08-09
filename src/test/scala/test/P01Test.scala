package test

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

import test.MyList._


class P01Test extends FlatSpec with ShouldMatchers {
  
  it should "get the last element" in {
    List(1, 2, 3, 4, 5).myLast should equal (5)
    
    List(1).myLast should equal (1)
  }
  
  it should "throw exception" in {
    intercept[NoSuchElementException] {
      Nil.myLast
    }
  }
  
}