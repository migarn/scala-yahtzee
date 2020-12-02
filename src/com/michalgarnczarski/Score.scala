package com.michalgarnczarski

class Score {

  val scores: List[Int] = List.fill(8)(-1)
  val labels: List[String] = List("Aces", "Twos", "Threes", "Fours", "Fives", "Sixes", "Bonus", "Score")

  def print: String = scores.zip(labels).map {case (x, y) => y + ": " + x + " pts."}.mkString("\n")

}
