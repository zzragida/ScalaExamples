package io.sweetheart.examples.pis.abstractMembers

import java.io.PrintWriter
import java.net.ServerSocket
import java.util.Date

object LoanPattern {
  def using[T <: { def close(): Unit }, S](obj: T)
                (operation: T => S): Unit = {
    val result = operation(obj)
    obj.close();
    result
  }

  def main(args: Array[String]): Unit = {
    using(new PrintWriter("date.txt")) { writer =>
      writer.println(new Date)
    }

    using (new ServerSocket(9999)) { serverSocket =>
      println("listening on port 9999....")

      using (serverSocket.accept()) { socket =>
        socket.getOutputStream.write("hello, world\n".getBytes)
      }
    }
  }
}
