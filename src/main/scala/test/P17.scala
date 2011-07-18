package test

object P17 {
  implicit def listToP17[E](list: List[E]) = new P17(list)
}

class P17[E](list: List[E]) {
  
  // Split a list into two parts.
  // The length of the first part is given. Use a Tuple for your result.
  // Example:
  // 
  // scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  // res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))  
  def split(length: Int): (List[E], List[E]) = {
    def _split(length: Int, list: List[E], acc: (List[E], List[E])): (List[E], List[E]) = (length, list) match {
      case (_, Nil) => (Nil, Nil)
      case (l, list) if(l < 0 || l >= list.length) => (list, Nil)
      case (0, list) => (acc._1, list)
      case (l, h :: tail) => _split(l - 1, tail, (acc._1 ::: List(h), Nil))
    }
    
    _split(length, list, (Nil, Nil))
  }
  
}

