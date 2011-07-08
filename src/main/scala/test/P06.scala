package test

object P06 {
  def isPalindrome[E](list: List[E]): Boolean = list match {
    case Nil | List() | _ :: Nil => true
    case head :: tail => (head == tail.last) && isPalindrome(tail.dropRight(1))
  }
}