List(1, 2, 3) map (_ + 1)
Set(1, 2, 3) map (_ * 2)
val xs = List(1,2,3,4,5)
val git = xs grouped 3
git.next()
git.next()
//git.next()
val sit = xs sliding 3
sit.next()
sit.next()
sit.next()
val fruit = Set("apple", "orage", "peach", "banana")
fruit("peach")
fruit("potato")
var s = Set(1, 2, 3)
s += 4; s -= 2
s
val s1 = Set(1, 2, 3)
//s1 += 4; s1 -= 2
s
val myOrdering = Ordering.fromLessThan[String](_ > _)
import scala.collection.immutable.TreeSet
import scala.collection.mutable

TreeSet.empty(myOrdering)
val set = TreeSet.empty[String]
val numbers = set + ("one", "two", "three", "four")
numbers range ("one", "two")
numbers from "three"
def f(x: String) = {
  println("taking my time")
  Thread.sleep(100)
  x.reverse
}
val cache = collection.mutable.Map[String, String]()
def cached(s: String) = cache.getOrElseUpdate(s, f(s))
cached("abc")
cached("abc")
import scala.collection.mutable.{Map, SynchronizedMap, HashMap}
object MapMaker {
  def makeMap: Map[String, String] = {
    new HashMap[String, String] with mutable.SynchronizedMap[String, String] {
      override def default(key: String) =
        "why do you want to know?"
    }
  }
}
val capital = MapMaker.makeMap
capital ++= List("US" -> "Washington", "France" -> "Paris")
capital("France")
capital("England")
capital += ("England" -> "London")

val str = 1 #:: 2 #:: 3 #:: Stream.empty
def fibFrom(a: Int, b: Int): Stream[Int] =
  a #:: fibFrom(b, a + b)
val fibs = fibFrom(1, 1).take(7)
fibs.toList

val vec = scala.collection.immutable.Vector.empty
val vec2 = vec :+ 1 :+ 2
val vec3 = 100 +: vec2
vec3(0)

val vec4 = Vector(1, 2, 3)
vec4 updated (2, 4)