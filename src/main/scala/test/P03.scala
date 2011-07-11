package test

object P03 {
  
  //Find the Kth element of a list.
  //By convention, the first element in the list is element 0.
  def nth[E](n: Int, ls: List[E]): E = (n, ls) match {
    case (0, elm :: _) => elm
    case (n, _ :: tail) => nth(n - 1, tail)
    case _ => throw new NoSuchElementException
  }
}