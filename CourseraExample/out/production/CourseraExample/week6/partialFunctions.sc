
object partialfunctions {
  // Problem
  val second: List[Int] => Int = {
    case x :: y :: _ => y
  }
  second(List(5, 6, 7))
  //second(List())

  val secondPartial: PartialFunction[List[Int], Int] = {
    case x :: y :: _ => y
  }
  secondPartial.isDefinedAt(List(5,6,7))
  secondPartial.isDefinedAt(List())
}