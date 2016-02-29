package io.sweetheart.examples.pis.abstractMembers

object DefOverVal {
  abstract class Fruit {
    val v: String
    def m: String
  }

  abstract class Apple extends Fruit {
    val v: String
    val m: String
  }

  abstract class BadApple extends Fruit {
    val v: String
    val m: String
  }
}
