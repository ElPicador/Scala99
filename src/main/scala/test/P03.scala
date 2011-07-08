package test

object P03 {
  def nth[E](n: Int, ls: List[E]): E = (n, ls) match {
    case (0, elm :: _) => elm
    case (n, _ :: tail) => nth(n - 1, tail)
    case _ => throw new NoSuchElementException
  }
}