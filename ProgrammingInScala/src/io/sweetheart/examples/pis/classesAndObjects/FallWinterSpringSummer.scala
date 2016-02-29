package io.sweetheart.examples.pis.classesAndObjects

import ChecksumAccumulator.calculate

object FallWinterSpringSummer {

  for (season <- List("fall", "winter", "spring"))
    println(season + ": " + calculate(season))
}
