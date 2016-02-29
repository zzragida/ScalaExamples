trait RationalTrait {
  val numerArg: Int
  val denomArg: Int
  require(denomArg != 0)
  private val g = gcd(numerArg, denomArg)
  val numer = numerArg / g
  val denom = denomArg / g
  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
  override def toString = numer + "/" + denom
}

val x = 2

//new RationalTrait {
//  val numerArg = 1 * x
//  val denomArg = 2 * x
//}

new {
  val numerArg = 1 * x
  val denomArg = 2 * x
} with RationalTrait

//new {
//  val numerArg = 1
//  val denomArg = this.numerArg * 2
//} with RationalTrait


object Demo {
  val x = { println("initializing x"); "done" }
}

Demo
Demo.x
