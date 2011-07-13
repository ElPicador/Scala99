package test

object P01 {
  
  // Find the last element of a list.
  def last[E](ls: List[E]): E = ls match {
    case head :: Nil => head
    case _ :: tail => last(tail)
    case _ => throw new NoSuchElementException
  }
}