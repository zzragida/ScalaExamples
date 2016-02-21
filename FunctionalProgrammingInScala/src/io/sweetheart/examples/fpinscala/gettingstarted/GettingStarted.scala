package io.sweetheart.examples.fpinscala.gettingstarted

object MyModule {
  def abs(n: Int): Int =
    if (n < 0) -1
    else n

  def factorial(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n-1, n*acc)

    go(n, 1)
  }

  def factorial2(n: Int): Int = {
    var acc = 1
    var i = n
    while (i > 0) { acc *= i; i -= 1 }
    acc
  }

  def fib(n: Int): Int = {
    @annotation.tailrec
    def loop(n: Int, prev: Int, cur: Int): Int = {
      if (n == 0) prev
      else loop(n - 1, cur, prev + cur)
    }
    loop(n, 0, 1)
  }

  private def formatAbs(n: Int) = {
    val msg = "The absolute value of %d is %d"
    msg.format(n, abs(n))
  }

  private def formatFactorial(n: Int) = {
    val msg = "The factorial of %d is %d"
    msg.format(n, factorial(n))
  }

  def formatResult(name: String, n: Int, f: Int => Int) = {
    val msg = "The %s of %d is %d"
    msg.format(name, n, f(n))
  }

  def main(args: Array[String]): Unit = {
    println(formatAbs(-42))
    println(formatFactorial(10))
  }
}

object FormatAbsAndFactorial {

  import MyModule._

  def main(args: Array[String]): Unit = {
    println(formatResult("absolute", -42, abs))
    println(formatResult("factorial", 10, factorial))
  }
}

object AnonymousFunctions {

  import MyModule._

  def main(args: Array[String]): Unit = {
    println(formatResult("absolute", -42, abs))
    println(formatResult("factorial", 7, factorial))
    println(formatResult("increment", 7, (x: Int) => x + 1))
    println(formatResult("increment", 7, (x) => x + 1))
    println(formatResult("increment", 7, x => x + 1))
    println(formatResult("increment", 7, _ + 1))
    println(formatResult("increment", 7, x => { val r = x + 1; r }))
  }
}

object MonomorphicBinarySearch {

  def findFirst(ss: Array[String], key: String): Int = {
    @annotation.tailrec
    def loop(n: Int): Int = {
      if (n >= ss.length) -1
      else if (ss(n) == key) n
      else loop(n + 1)
    }

    loop(0)
  }
}

object PolymorphicFunctions {

  def findFirst(as: Array[A], p: A => Boolean): Int = {
    @annotation.tailrec
    def loop(n: Int): Int = {
      if (n >= as.length) -1
      else if (p(as(n))) n
      else loop(n + 1)
    }

    loop(0)
  }

  def isSorted(as: Array[A], gt: (A, A) => Boolean): Boolean = {
    @annotation.tailrec
    def go(n: Int): Boolean = {
      if (n >= as.length-1) true
      else if (gt(as(n), as(n+1))) false
      else go(n+1)
    }

    go(0)
  }

  def partial1[A, B, C](a: A, f:(A, B) => C): B => C = {
    (b: B) => f(a, b)
  }

  def curry[A,B,C](f: (A, B) => C): A => (B => C) = {
    a => b => f(a, b)
  }

  def uncurry[A,B,C](f: A => B => C): (A, B) => C = {
    (a, b) => f(a)(b)
  }

  def compose[A,B,C](f: B => C, g: A => B): A => C = {
    a => f(g(a))
  }
}