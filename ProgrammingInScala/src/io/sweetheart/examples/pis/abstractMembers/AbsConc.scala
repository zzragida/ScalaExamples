package io.sweetheart.examples.pis.abstractMembers

object AbsConc {
  trait Abstract {
    type T
    def transform(x: T): T
    val initial: T
    var current: T
  }

  class Concreate extends Abstract {
    type T = String
    def transform(x: String) = x + x
    val initial = "hi"
    var current = initial
  }
}
