import week3.Rational

object scratch {
  new Rational(1, 2)                              //> res0: week3.Rational = 1/2

  def error(msg: String) = throw new Error(msg)   //> error: (msg: String)Nothing

  val x = null                                    //> x  : Null = null
  val y: String = null                            //> y  : String = null
  //val z: Int = null
}