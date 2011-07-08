package test

object P05 {
  def reverse[E](ls: List[E]): List[E] = ls match {
    case Nil | List() | _ :: Nil => ls
    case head :: tail => reverse(tail) ::: List(head)
  }
}