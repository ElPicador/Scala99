package test

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class P03Test extends FlatSpec with ShouldMatchers {
  
  it should "get the n-th element" in {
    val list = List(1, 2, 3, 4, 5)
    P03.nth(4, list) should equal (5)
    
    val oneElementList = List(1)
    P03.nth(0, oneElementList) should equal (1)
  }
  
}