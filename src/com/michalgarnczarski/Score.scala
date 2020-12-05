package com.michalgarnczarski

class Score {

  val scores: List[Int] = List.fill(8)(-1)

  val labels: List[String] = List("Aces", "Twos", "Threes", "Fours", "Fives", "Sixes", "Bonus", "Score")

  def print: String = scores.zip(labels).map {case (x, y) => f"$y%-8s $x%3d pts."}.mkString("\n")

  def addScore(cast: List[Int], chosenFigures: Int): List[Int] =
    scores.updated(chosenFigures - 1, cast.count(_ == chosenFigures) * chosenFigures)

  def calculateScore(): List[Int] = {
    val upperSectionSum: Int = scores.filter(_ != -1).sum
    val bonus: Int = if (upperSectionSum >= 63) 35 else 0
    scores.updated(6, bonus)
    scores.updated(7, upperSectionSum + bonus)
  }

}
