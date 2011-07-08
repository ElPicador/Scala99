package test

object P02 {
  def penultimate[E](ls: List[E]): E = ls match {
    case el1 :: _ :: Nil => el1
    case _ :: tail => penultimate(tail)
    case _ => throw new NoSuchElementException     
  }
}