package week5

object Implicit {

  def example1: Unit = {
    implicit val v = 2
    def p(implicit i:Int) = println(i)
    p
  }

  def example2: Unit = {
    implicit def x = 7
    implicit var y = 10L
    def p(implicit a:Int, b:Long) = println(a, b)
    p
  }

  def example3: Unit = {
    implicit val x = 3
    implicit var y = "string"
    def p(a: Int)(implicit b: Int, c: String) = println(a, b,  c)
    p(10)
  }

  def example4: Unit = {
    implicit val x = 3
    def p(implicit a: Int, b: Long*) = println(a, b)
    p(1, 2, 3, 4, 5)
  }

  def example5: Unit = {
    implicit val x = 10
    def p(a: Long*)(implicit i:Int) = println(a, i)
    p(1, 2, 3, 4)
  }
}
