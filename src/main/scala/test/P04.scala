package test

object P04 {
  
  //Find the number of elements of a list.
  def length[E](ls: List[E]): Int = ls match {
    case Nil => 0
    case head :: Nil => 1
    case _ :: tail => length(tail) + 1
  }
}