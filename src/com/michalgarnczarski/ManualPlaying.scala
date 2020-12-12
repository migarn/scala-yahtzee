package com.michalgarnczarski

import com.michalgarnczarski.InputScanner._

class ManualPlaying extends PlayingMethod {

  def printAvailableFigures(score: Score): String = {""}

  def defineAvailableFigures(score: Score): Array[Int] = {
    for {i <- Array.range(0, 5)
         if score.scores(i) == -1
    } yield i + 1
  }

  def calculateScore(score: Score, cast: List[Int]): String = {
    val chosenFigure: Int = scanIntForSelectionList(
      "\nSelect figures to be scored:" + printAvailableFigures(score), defineAvailableFigures(score): _*)
    score.addScore(cast, chosenFigure)
    println("\nYour score:")
    score.calculateScore()
    score.print
  }

  def sleep(): Unit = Thread.sleep(1000)

}
