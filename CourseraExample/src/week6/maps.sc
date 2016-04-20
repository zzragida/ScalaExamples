//package week6

object maps {
  Map("x" -> 1, "y" -> 25)
  Map(("x", 1), ("y", 25))

  val romanNumerals = Map("I" -> 1, "V" -> 5, "X" -> 10)
  val capitalOfCountry = Map("US" -> "Washington", "Switzerland" -> "Bern")

  Map("x" -> 10, 3 -> 20)
  Map("x" -> 10, "y" -> "text")

  //capitalOfCountry("Korea") // NoSuchElementException !!
  capitalOfCountry get "Korea"

  capitalOfCountry("US")
  capitalOfCountry get "US"

  def showCapital(country: String) = capitalOfCountry.get(country) match {
    case Some(capital) => capital
    case None => "missing data"
  }

  showCapital("US")
  showCapital("Korea")


  val fruits = List("apple", "pear", "orange", "pineapple")
  fruits.sortWith(_.length < _.length)
  fruits.sorted
  fruits groupBy (_.head)

  val numbers = List(-3, -1, 5, 3, 10, 1)
  numbers.sorted
  numbers groupBy (_ > 0)

  val range = 1 to 1000 toList

  def f(x: String) = {
    Thread.sleep(1000)
    x.reverse
  }

  val cache = collection.mutable.Map[String, String]()
  def cachedF(s: String) = cache.getOrElseUpdate(s, f(s))

  cachedF("abc")
  cachedF("abc")
  cachedF("xyz")
  cachedF("xyz")
  cachedF("xyz")
  cachedF("xyz")
  cachedF("xyz")
  cachedF("xyz")
}