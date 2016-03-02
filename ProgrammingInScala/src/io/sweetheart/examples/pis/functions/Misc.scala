package io.sweetheart.examples.pis.functions

object Misc {

  def misc1(): Unit = {
    val numbers = List(-11, -10, -5, 0, 5, 10)
    numbers.foreach(println _)
    numbers.foreach(x => println(x))
    numbers.foreach(println _)
    numbers.foreach(println)
  }

  def isEven(x: Int): Boolean =
    if (x == 0) true else isOdd(x - 1)
  def isOdd(x: Int): Boolean =
    if (x == 0) false else isEven(x - 1)

  val funValue = nestedFun _
  def nestedFun(x: Int): Unit = {
    if (x != 0) { println(x); funValue(x - 1) }
  }

  def main(args: Array[String]): Unit = {
    misc1()

    println("gcbx isEven(2) [" + isEven(2) + "]")
    nestedFun(2)
  }
}
