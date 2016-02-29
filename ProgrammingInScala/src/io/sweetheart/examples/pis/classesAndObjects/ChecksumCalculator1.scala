package io.sweetheart.examples.pis.classesAndObjects

object ChecksumCalculator1 {
  class ChecksumCalculator {
    var sum = 0
  }

  def main(args: Array[String]) = {
    val calc =  new ChecksumCalculator

    println("calc.sum [" + calc.sum + "]")
  }
}
