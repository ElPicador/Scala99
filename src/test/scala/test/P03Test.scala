package test

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

import org.scalacheck.Prop
import org.scalacheck.Prop._
import org.scalacheck.Arg
import org.scalatest.prop.Checkers._
import org.scalacheck.Arbitrary.arbitrary

class P03Test extends FlatSpec with ShouldMatchers {
  it should "validate the property" in {    
    check( Prop.forAll { (list: List[Int], n: Int) => 
      (n > 0 && list.length > n) ==> 
        (list(n) == P03.nth(n, list))
    }, maxDiscarded(1500) )
  }
  
  it should "get the n-th element" in {
    val list = List(1, 2, 3, 4, 5)
    P03.nth(4, list) should equal (5)
    
    val oneElementList = List(1)
    P03.nth(0, oneElementList) should equal (1)
  }
  
}