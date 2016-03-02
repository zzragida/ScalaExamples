package io.sweetheart.examples.pis.functions

object NamedDefault {

  def printTime(out: java.io.PrintStream = Console.out) =
    out.println("time = " + System.currentTimeMillis())

  def printTime2(out: java.io.PrintStream = Console.out,
                divisor: Int = 1): Unit = {
    out.println("time = " + System.currentTimeMillis() / divisor)
  }

  def main(args: Array[String]): Unit = {
    printTime()
    printTime(Console.err)

    printTime2()
    printTime2(out = Console.err)
    printTime2(divisor = 100)
    printTime2(out = Console.err, divisor = 100)
  }
}
