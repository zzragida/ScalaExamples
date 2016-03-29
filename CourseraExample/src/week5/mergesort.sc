//package week5

object mergesort {
  /* ------------------------------------------------------------- */
  // step1
//  def merge(xs: List[Int], ys: List[Int]): List[Int] = xs match {
//    case Nil => ys
//    case x :: xs1 => ys match {
//      case Nil => xs
//      case y :: ys1 =>
//        if (x < y) x :: merge(xs1, ys)
//        else y :: merge(xs, ys1)
//    }
//  }

//  def msort(xs: List[Int]): List[Int] = {
//    val n = xs.length / 2
//    if (n == 0) xs
//    else {
//      val (fst, snd) = xs splitAt n
//      merge(msort(fst), msort(snd))
//    }
//  }

  /* ------------------------------------------------------------- */
  // step2
//  def msort(xs: List[Int]): List[Int] = {
//    val n = xs.length / 2
//    if (n == 0) xs
//    else {
//      def merge(xs: List[Int], ys: List[Int]): List[Int] = (xs, ys) match {
//        case (`Nil`, `ys`) => ys
//        case (`xs`, `Nil`) => xs
//        case (x :: xs1, y :: ys1) =>
//          if (x < y) x :: merge(xs1, ys)
//          else y :: merge(xs, ys1)
//      }
//
//      val (fst, snd) = xs splitAt n
//      merge(msort(fst), msort(snd))
//    }
//  }

  /* ------------------------------------------------------------- */
  // step3-1 Int => T
//  def msort[T](xs: List[T]): List[T] = {
//    val n = xs.length / 2
//    if (n == 0) xs
//    else {
//      def merge(xs: List[T], ys: List[T]): List[T] = (xs, ys) match {
//        case (`Nil`, `ys`) => ys
//        case (`xs`, `Nil`) => xs
//        case (x :: xs1, y :: ys1) =>
//          if (x < y) x :: merge(xs1, ys)
//          else y :: merge(xs, ys1)
//      }
//
//      val (fst, snd) = xs splitAt n
//      merge(msort(fst), msort(snd))
//    }
//  }

  /* ------------------------------------------------------------- */
  // step3-2 append lt
//  def msort[T](xs: List[T])(lt: (T, T) => Boolean): List[T] = {
//    val n = xs.length / 2
//    if (n == 0) xs
//    else {
//      def merge(xs: List[T], ys: List[T]): List[T] = (xs, ys) match {
//        case (`Nil`, `ys`) => ys
//        case (`xs`, `Nil`) => xs
//        case (x :: xs1, y :: ys1) =>
//          if (lt(x, y)) x :: merge(xs1, ys)
//          else y :: merge(xs, ys1)
//      }
//
//      val (fst, snd) = xs splitAt n
//      merge(msort(fst)(lt), msort(snd)(lt))
//    }
//  }

  /* ------------------------------------------------------------- */
  // step3-3 ordering (scala.match.Ordering[T])
//  import scala.math.Ordering
//
//  def msort[T](xs: List[T])(ord: Ordering[T]): List[T] = {
//    val n = xs.length / 2
//    if (n == 0) xs
//    else {
//      def merge(xs: List[T], ys: List[T]): List[T] = (xs, ys) match {
//        case (`Nil`, `ys`) => ys
//        case (`xs`, `Nil`) => xs
//        case (x :: xs1, y :: ys1) =>
//          if (ord.lt(x, y)) x :: merge(xs1, ys)
//          else y :: merge(xs, ys1)
//      }
//
//      val (fst, snd) = xs splitAt n
//      merge(msort(fst)(ord), msort(snd)(ord))
//    }
//  }

  /* ------------------------------------------------------------- */
  // step3-3 ordering (scala.match.Ordering[T])
  import scala.math.Ordering

  def msort[T](xs: List[T])(implicit ord: Ordering[T]): List[T] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {
      def merge(xs: List[T], ys: List[T]): List[T] = (xs, ys) match {
        case (`Nil`, `ys`) => ys
        case (`xs`, `Nil`) => xs
        case (x :: xs1, y :: ys1) =>
          if (ord.lt(x, y)) x :: merge(xs1, ys)
          else y :: merge(xs, ys1)
      }

      val (fst, snd) = xs splitAt n
      merge(msort(fst), msort(snd))
    }
  }

  /* ------------------------------------------------------------- */
  // test1
//  val list = List(2, -4, 5, 7, 1)
//  msort(list)

  /* ------------------------------------------------------------- */
  // test2
//  val list = List(2, -4, 5, 7, 1)
//  var fruits = List("apple", "pineapple", "orange", "banana")
//
//  msort(list)((x, y) => x < y)
//  msort(fruits)((x, y) => x.compareTo(y) < 0)

  /* ------------------------------------------------------------- */
  // test3
//  val list = List(2, -4, 5, 7, 1)
//  var fruits = List("apple", "pineapple", "orange", "banana")
//
//  msort(list)(Ordering.Int)
//  msort(fruits)(Ordering.String)

  /* ------------------------------------------------------------- */
  // test4
  val list = List(2, -4, 5, 7, 1)
  var fruits = List("apple", "pineapple", "orange", "banana")

  msort(list)
  msort(fruits)
}

