package com.michalgarnczarski

import scala.collection.mutable.MutableList

class Score {

  val scores: MutableList[Int] = MutableList.fill(8)(-1)

  val labels: List[String] = List("Aces", "Twos", "Threes", "Fours", "Fives", "Sixes", "Bonus", "Score")

  def print: String = scores.zip(labels).map {case (x, y) => f"$y%-8s $x%3d pts."}.mkString("\n")

  def addScore(cast: List[Int], chosenFigures: Int): MutableList[Int] = {
    scores.update(chosenFigures - 1, cast.count(_ == chosenFigures) * chosenFigures)
    scores
  }

  def calculateScore(): MutableList[Int] = {
    val upperSectionSum: Int = scores.filter(_ != -1).sum
    val bonus: Int = if (upperSectionSum >= 63) 35 else 0
    scores.update(6, bonus)
    scores.update(7, upperSectionSum + bonus)
    scores
  }
}
