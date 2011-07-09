package test

object P02 {
  def penultimate[E](ls: List[E]): E = ls match {
    case Nil | List() => throw new NoSuchElementException     
    case el1 :: _ :: Nil => el1
    case _ :: tail => penultimate(tail)
  }
}