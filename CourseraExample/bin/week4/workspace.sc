
trait Function1[A, B] {
  def apply(x: A): B
}

trait Function2[A, B, C] {
  def apply(x: A, y: B): C
}

(x: Int) => x * x

val func = new Function1[Int, Int] {
  def apply(x: Int) = x * x
}
func.apply(3)
func(10)

val func1 = new Function1[Int, Boolean] {
  def apply(x: Int) = if (x > 0) true else false
}
func1(1)
func1(-10)
