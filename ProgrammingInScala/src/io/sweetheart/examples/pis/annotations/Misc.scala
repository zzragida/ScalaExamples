package io.sweetheart.examples.pis.annotations

object Misc {
  @deprecated class QuickAndDirty {

  }

  def unchecked(e: Any): Unit = {
    (e: @unchecked) match {
      case "foo" => println("foo")
    }
  }
}
