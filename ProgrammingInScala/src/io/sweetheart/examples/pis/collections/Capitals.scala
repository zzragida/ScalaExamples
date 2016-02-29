package io.sweetheart.examples.pis.collections

object Capitals {
  def useImmut(): Unit = {
    var capital = Map("US" -> "Washington", "France" -> "Paris")
    capital += ("Japan" -> "Tokyo")
    println(capital("France"))
  }

  def useMut(): Unit = {
    import scala.collection.mutable.Map
    var capital = Map("US" -> "Washington", "France" -> "Paris")
    capital += ("Japan" -> "Tokyo")
    println(capital("France"))
  }

  def main(args: Array[String]): Unit = {
    useImmut()
    useMut()
  }
}
