package test

object P15 {
  implicit def listToP15[E](list: List[E]) = new P15(list)
}

class P15[E](list: List[E]) {
  
  //Duplicate the elements of a list a given number of times.
  //Example:
  //scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
  //res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
  def duplicateN(n: Int): List[E] = list flatMap { List.fill(n)(_) }
  
}

