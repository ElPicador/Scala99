package test

object MyList {
  implicit def listToMyList[E](list: List[E]) = new MyList(list)
}

class MyList[E](list: List[E]) {
  // Find the last element of a list.
  def myLast(): E = list match {
    case head :: Nil => head
    case _ :: tail => (new MyList(tail)).myLast
    case _ => throw new NoSuchElementException
  }
  
  //Find the last but one element of a list.
  def penultimate(): E = list match {
    case List() | (_ :: Nil) => throw new NoSuchElementException     
    case el1 :: _ :: Nil => el1
    case _ :: tail => (new MyList(tail)).penultimate
  }
  
  //Find the Kth element of a list.
  //By convention, the first element in the list is element 0.
  def nth(n: Int): E = (n, list) match {
    case (0, elm :: _) => elm
    case (n, _ :: tail) => (new MyList(tail)).nth(n - 1)
    case _ => throw new NoSuchElementException
  }
  
}
