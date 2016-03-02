package io.sweetheart.examples.pis.functions

import scala.io.Source

object LongLines2 {

  object LongLines {
    def processFile(filename: String, width: Int): Unit = {
      def processLine(filename: String, width: Int, line: String): Unit = {
        if (line.length > width)
          println(filename + ": " + line)
      }

      val source = Source.fromFile(filename)
      for (line <- source.getLines()) {
        processLine(filename, width, line)
      }
    }
  }

  object FindLongLines {
    def main(args: Array[String]): Unit = {
      val width = args(0).toInt
      for (arg <- args.drop(1))
        LongLines.processFile(arg, width)
    }
  }

  def main(args: Array[String]) = FindLongLines.main(args)
}
