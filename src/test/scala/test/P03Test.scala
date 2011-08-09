package test

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers

import org.scalacheck.Prop
import org.scalacheck.Prop._
import org.scalacheck.Arg
import org.scalatest.prop.Checkers._
import org.scalacheck.Arbitrary.arbitrary

import test.MyList._


class P03Test extends FlatSpec with ShouldMatchers {
  it should "validate the property" in {    
    check( Prop.forAll { (list: List[Int], n: Int) => 
      (n > 0 && list.length > n) ==> 
        (list(n) == list.nth(n))
    }, maxDiscarded(1500) )
  }
  
  it should "get the n-th element" in {
    List(1, 2, 3, 4, 5).nth(4) should equal (5)
    
    List(1).nth(0) should equal (1)
  }
  
  it should "throw exception" in {
    intercept[NoSuchElementException] {
      Nil.nth(1)
    }
    
    intercept[NoSuchElementException] {
      Nil.nth(-1)
    }
  }
  
  
}