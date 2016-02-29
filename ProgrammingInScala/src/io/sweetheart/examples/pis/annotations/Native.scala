package io.sweetheart.examples.pis.annotations

class Native {
  @Native
  def beginCountdown() {}
}

object Native {
  System.loadLibrary("Native")

  def main(arg: Array[String]): Unit = {
    new Native().beginCountdown()
  }
}
