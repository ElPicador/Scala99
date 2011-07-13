package test

object P12 {
  implicit def listToP12[E](list: List[(Int, E)]) = new P12(list)
}

class P12[E](list: List[(Int, E)]) {
  
  //Decode a run-length encoded list.
  //Given a run-length code list generated as specified in problem P10, construct its uncompressed version.
  //Example:
  //scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
  //res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)  
  def decode(): List[E] = list match {
    case Nil => List()
    case _ => list.flatMap { t => List.fill(t._1)(t._2) } 
  }
}