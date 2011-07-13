package test

object P13 {
  implicit def listToP13[E](list: List[E]) = new P13(list)
}

class P13[E](list: List[E]) {
  
  //Run-length encoding of a list (direct solution).
  //Implement the so-called run-length encoding data compression method directly. I.e. don't use other methods you've written (like P09's pack); 
  //do all the work directly.
  //Example:

  //scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  //res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))  
  def encodeDirect(): List[(Int, E)] = {
    if(list.isEmpty) {
      Nil
    } else {
      val (toPack, rest) = list span { _ == list.head }
      (toPack.length, toPack.head) :: (new P13(rest)).encodeDirect
    }
  }
}