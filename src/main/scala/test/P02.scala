package test

object P02 {
  
  //Find the last but one element of a list.
  def penultimate[E](ls: List[E]): E = ls match {
    case List() | (_ :: Nil) => throw new NoSuchElementException     
    case el1 :: _ :: Nil => el1
    case _ :: tail => penultimate(tail)
  }
}