package test

object P18 {
  implicit def listToP18[E](list: List[E]) = new P18(list)
}

class P18[E](list: List[E]) {
  
  // Extract a slice from a list.
  // Given two indices, I and K, the slice is the list containing the elements from and including the Ith element 
  // up to but not including the Kth element of the original list. Start counting the elements with 0.
  // Example:
  // 
  // scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  // res0: List[Symbol] = List('d, 'e, 'f, 'g)
  def mySlice(start: Int, end: Int): List[E] = list.drop(start).dropRight(end - start)

}

