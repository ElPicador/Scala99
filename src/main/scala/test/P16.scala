package test

object P16 {
  implicit def listToP16[E](list: List[E]) = new P16(list)
}

class P16[E](list: List[E]) {
  
  // Drop every Nth element from a list.
  // Example:
  // scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  // res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
  def myDrop(n: Int): List[E] = {
    def _myDrop(n: Int, acc: Int, ls: List[E]): List[E] = (acc, ls) match {
      case (_, Nil) => Nil
      case (1, _ :: tail) => _myDrop(n, n, tail)
      case (x, head :: tail) => head :: _myDrop(n, x-1, tail)
    }
    
    _myDrop(n, n, list)
  }
  
}

