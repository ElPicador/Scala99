package test

object P14 {
  implicit def listToP14[E](list: List[E]) = new P14(list)
}

class P14[E](list: List[E]) {
  
  //Duplicate the elements of a list.
  //Example:
  //scala> duplicate(List('a, 'b, 'c, 'c, 'd))
  //res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
  def duplicate(): List[E] = list flatMap { List.fill(2)(_) }
  
}