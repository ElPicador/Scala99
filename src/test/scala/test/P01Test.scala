package test

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class P01Test extends FlatSpec with ShouldMatchers {
  
  it should "get the last element" in {
    val list = List(1, 2, 3, 4, 5)
    P01.last(list) should equal (5)
    
    val oneElementList = List(1)
    P01.last(oneElementList) should equal (1)
  }
  
  it should "throw exception" in {
    intercept[NoSuchElementException] {
      P01.last(List())
    }
  }
  
}