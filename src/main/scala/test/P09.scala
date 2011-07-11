package test

object P09 {
  
  //Pack consecutive duplicates of list elements into sublists.
  //If a list contains repeated elements they should be placed in separate sublists.
  def pack[E](list: List[E]): List[List[E]] = 
    if(list.isEmpty) {
      List(list)
    } else {
      val (toPack, rest) = list span { _ == list.head }
      if(rest.isEmpty) {
        List(toPack)
      } else {
        List(toPack) ++ pack(rest)
      }
    }
}