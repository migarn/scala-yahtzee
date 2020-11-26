package com.michalgarnczarski

object CastPrinter {

  def print(castResult: List[Int]): String = {

    def printSingleDice(result: Int): String = {
      val line1: String = "\u250c\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510 "
      val line2: String = ""
      val line3: String = ""
      val line4: String = ""
      val line5: String = "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518 "
      line1 + "\n" + line2 + "\n" + line3 + "\n" + line4 + line5
    }


    printSingleDice(0)
  }
}
