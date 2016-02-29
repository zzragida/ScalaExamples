package io.sweetheart.examples.pis.annotations

object Deprecation2 {

  @deprecated("use newShinyMethod() instead")
  def bigMistake() =
    "bigMistake"

  def newShinyMethod() =
    "all shiny"

  def main(arg: String) = {
    bigMistake();
  }
}
