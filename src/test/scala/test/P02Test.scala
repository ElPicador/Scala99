package test

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class P02Test extends FlatSpec with ShouldMatchers {
  
  it should "get the penultieme element" in {
    val list = List(1, 2, 3, 4, 5)
    P02.penultimate(list) should equal (4)
    
    val list2 = List(1, 2)
    P02.penultimate(list2) should equal (1)
  }
  
}