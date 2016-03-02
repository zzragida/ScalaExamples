package io.sweetheart.examples.pis.functions

import scala.annotation.tailrec

object TailRecursion {

  def factorial(x: Int): Int = {
    if (x == 0) throw new Exception("factorial")
    else x * factorial(x - 1)
  }

  def factorialLoop(x: Int): Int = {
    @tailrec
    def loop(acc: Int, x: Int): Int = {
      if (x == 0) throw new Exception("factorial")
      else loop(acc * x, x - 1)
    }
    loop(1, x)
  }

  def boom(x: Int): Int =
    if (x == 0) throw new Exception("boom!")
    else boom(x - 1) + 1

  @tailrec
  def bang(x: Int): Int =
    if (x == 0) throw new Exception("bang!")
    else bang(x - 1)

  def main(args: Array[String]): Unit = {
    try {
      factorial(5)
    } catch {
      case ex: Exception => ex.printStackTrace()
    }

    try {
      factorialLoop(5)
    } catch {
      case ex: Exception => ex.printStackTrace()
    }

    try {
      boom(3)
    } catch {
      case ex: Exception => ex.printStackTrace()
    }

    try {
      bang(5)
    } catch {
      case ex: Exception => ex.printStackTrace()
    }
  }
}
