
val fruits = List("apples", "oranges", "pears")
val nums = List(1, 2, 3, 4)
val diag3 = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1))
val empty = List()

fruits.head == "apples"
fruits.tail.head == "oranges"
diag3.head == List(1, 0, 0)
//empty.head == throw new NoSuchElementException("head of empty list")

val nums1 = 1 :: (2 :: (3 :: (4 :: Nil)))
val nums2 = 1 :: 2 :: 3 :: 4 :: Nil
val nums3 = Nil.:: (4) .:: (3) .:: (2) .:: (1)

val l = 1 :: 3 :: List(List(4, 5), List(8, 9)) :: 10 :: Nil
l.length

val list = List(4, 3, 2, 1)
// insert
def insert(x: Int, xs: List[Int]): List[Int] = xs match {
  case List() => List(x)
  case y :: ys => if (x <= y) x :: xs else y :: insert(x, ys)
}

// isort
def isort(xs: List[Int]): List[Int] = xs match {
  case List() => List()
  case y :: ys => insert(y, isort(ys))
}
isort(list)

// xs.length
// xs.last
def last[T](xs: List[T]): T = xs match {
  case List() => throw new Error("last of empty list")
  case List(x) => x
  case y :: ys => last(ys)
}
last(list)

// xs.init
def init[T](xs: List[T]): List[T] = xs match {
  case List() => throw new Error("init of empty list")
  case List(x) => List()
  case y :: ys => y :: init(ys)
}
init(list)

// concat
def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {
  case List() => ys
  case z :: zs => z :: concat(zs, ys)
}
concat(list, List(5, 6, 7, 8))

// reverse
def reverse[T](xs: List[T]): List[T] = xs match {
  case List() => xs
  case y :: ys => reverse(ys) ++ List(y)
}
reverse(list)

// removeAt
def removeAt(n: Int, xs: List[Int]) = (xs take n) ::: (xs drop n + 1)
removeAt(2, list)

// flatten
def flatten(xs: List[Any]): List[Any] = xs match {
  case Nil => Nil
  case (head: List[_]) :: tail => flatten(head) ++ flatten(tail)
  case head :: tail => head :: flatten(tail)
}
flatten(List(List(1, 1), 2, List(3, List(5, 8))))


// pair
val pair = ("answer", 42)
val (label, value) = pair

// tuple
case class Tuple2[T1, T2](_1: +T1, _2: +T2) {
  override def toString = "(" + _1 + "," + _2 + ")"
}
