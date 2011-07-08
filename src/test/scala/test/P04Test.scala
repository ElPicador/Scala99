package test

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class P04Test extends FlatSpec with ShouldMatchers {
  
  it should "get the length" in {
    val list = List(1, 2, 3, 4, 5)
    P04.length(list) should equal (5)
    
    val emptyList = List[Int]()
    P04.length(emptyList) should equal (0)
  }
  
}