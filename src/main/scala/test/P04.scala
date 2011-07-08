package test

object P04 {
  def length[E](ls: List[E]): Int = ls match {
    case Nil => 0
    case head :: Nil => 1
    case _ :: tail => length(tail) + 1
  }
}