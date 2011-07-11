package test

object P07 {
  
  //Flatten a nested list structure
  def flatten(list: List[Any]): List[Any] = list match {
    case Nil | List() => list
    case (head: List[Any]) :: tail => flatten(head) ++ flatten(tail)
    case head :: tail => head :: flatten(tail)
  }
  
}