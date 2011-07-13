package test

object P06 {
  
  //Find out whether a list is a palindrome.
  def isPalindrome[E](list: List[E]): Boolean = list match {
    case List() | _ :: Nil => true
    case head :: tail => (head == tail.last) && isPalindrome(tail.dropRight(1))
  }
}