package test

object P08 {
  
  //Eliminate consecutive duplicates of list elements.
  //If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.
  def compress[E](list: List[E]): List[E] = list match {
    case List() => list
    case head_1 :: head_2 :: tail if head_1 == head_2 => compress(head_1 :: tail)
    case head :: tail => head :: compress(tail)
  }
}