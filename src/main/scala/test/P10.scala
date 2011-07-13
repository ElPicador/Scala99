package test

object P10 {
  implicit def listToP10[E](list: List[E]) = new P10(list)
}

class P10[E](list: List[E]) {
  
  //Run-length encoding of a list.
  //Use the result of problem P09 to implement the so-called run-length encoding data compression method. 
  //Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.
  def encode(): List[(Int, E)] = list match {
    case Nil => Nil
    case _ => P09.pack(list) map { e => (e.length, e.head) }
  }
}