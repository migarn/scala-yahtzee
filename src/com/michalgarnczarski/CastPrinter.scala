package com.michalgarnczarski

object CastPrinter {

  def print(castResult: List[Int]): String = {

    def printSingleDice(result: Int): String = {
      val line1: String = "\u250c\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510 "
      val line5: String = "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518 "

      val empty: String = "\u2502       \u2502 "
      val oneLeft: String = "\u2502 O     \u2502 "
      val oneMiddle: String = "\u2502   O   \u2502 "
      val oneRight: String = "\u2502     O \u2502 "
      val two: String = "\u2502 O   O \u2502 "

      val line2: String = result match {
        case 1 => empty
        case 2 | 3 => oneLeft
        case 4 | 5 | 6 => two
      }

      val line3: String = result match {
        case 1 | 3 | 5 => oneMiddle
        case 2 | 4 => empty
        case 6 => two
      }

      val line4: String = result match {
        case 1 => empty
        case 2 | 3 => oneRight
        case 4 | 5 | 6 => two
      }

      line1 + "\n" + line2 + "\n" + line3 + "\n" + line4 + "\n" + line5
    }


    printSingleDice(castResult(0))
  }
}
