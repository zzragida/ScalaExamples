package io.sweetheart.examples.pis.classesAndObjects

import ChecksumAccumulator.calculate

object Summer {

  def main(args: Array[String]) = {
    for (arg <- args)
      println(arg + ": " + calculate(arg))
  }
}
