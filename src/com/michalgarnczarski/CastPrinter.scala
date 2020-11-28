package com.michalgarnczarski

object CastPrinter {

  def print(castResult: List[Int]): String = {

    def printSingleDice(diceResult: Int): String = {

      val emptyLine: String = "\u2502       \u2502 "
      val lineWithLeftOne: String = "\u2502 O     \u2502 "
      val lineWithMiddleOne: String = "\u2502   O   \u2502 "
      val lineWithRightOne: String = "\u2502     O \u2502 "
      val lineWithTwo: String = "\u2502 O   O \u2502 "

      val line1: String = "\u250c\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2510 "
      val line5: String = "\u2514\u2500\u2500\u2500\u2500\u2500\u2500\u2500\u2518 "
      val line2: String = diceResult match {
        case 1 => emptyLine
        case 2 | 3 => lineWithLeftOne
        case 4 | 5 | 6 => lineWithTwo
      }
      val line3: String = diceResult match {
        case 1 | 3 | 5 => lineWithMiddleOne
        case 2 | 4 => emptyLine
        case 6 => lineWithTwo
      }
      val line4: String = diceResult match {
        case 1 => emptyLine
        case 2 | 3 => lineWithRightOne
        case 4 | 5 | 6 => lineWithTwo
      }

      line1 + "\n" + line2 + "\n" + line3 + "\n" + line4 + "\n" + line5
    }

    def printAllDice(alreadyPrinted: String, currentDice: Int): String = {

      def mergeStrings(leftString: String, rightString: String): String =
        leftString.split("\n").zip(rightString.split("\n")).map {case (x, y) => x + y}.mkString("\n")

      if (currentDice == castResult.length) alreadyPrinted
      else printAllDice(mergeStrings(alreadyPrinted, printSingleDice(castResult(currentDice))), currentDice + 1)
    }

    printAllDice(" \n \n \n \n ",0)
  }
}
