package io.sweetheart.examples.pis.annotations

object Deprecation1 {
  @deprecated def bigMistake() =
    "bigMistake"

  def main(args: String): Unit = {
    bigMistake();
  }
}
