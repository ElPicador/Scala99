package test

object P11 {
  implicit def listToP11[E](list: List[E]) = new P11(list)
}

class P11[E](list: List[E]) {
  
  //Modified run-length encoding.
  //Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into the result list. 
  //Only elements with duplicates are transferred as (N, E) terms.
  def encode(): List[Any] = list match {
    case Nil => Nil
    case head :: _ => P09.pack(list).map { e => if(e.length == 1) e.head else (e.length, e.head) }
  }
}