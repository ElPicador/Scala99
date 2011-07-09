package test

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

class P02Test extends FlatSpec with ShouldMatchers {
  
  it should "validate the property" in {
    check( Prop.forAll { list: List[Int] => (list.length >= 2) ==> list.dropRight(2).head == P02.property(list)} )
  }
  
  it should "get the penultieme element" in {
    val list = List(1, 2, 3, 4, 5)
    P02.penultimate(list) should equal (4)
    
    val list2 = List(1, 2)
    P02.penultimate(list2) should equal (1)
  }
  
}