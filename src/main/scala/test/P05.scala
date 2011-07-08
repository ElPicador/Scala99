package test

object P05 {
  def reverse[E](ls: List[E]): List[E] = ls match {
    case Nil => Nil
    case List() => ls
    case head :: Nil => ls
    case head :: tail => reverse(tail) ::: List(head)
  }
}