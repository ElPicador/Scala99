package test

object P01 {
  def last[E](ls: List[E]): E = ls match {
    case head :: Nil => head
    case head :: tail => last(tail)
    case _ => throw new NoSuchElementException
  }
}