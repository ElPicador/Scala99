package test

object P05 {
  
  //Reverse a list.
  def reverse[E](ls: List[E]): List[E] = ls match {
    case Nil | List() | _ :: Nil => ls
    case head :: tail => reverse(tail) ::: List(head)
  }
}