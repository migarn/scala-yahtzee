package com.michalgarnczarski

class Player(val name: String, val playingMethod: PlayingMethod) {
  val score: Score = new Score
  def takeTurn(): Score = playingMethod.takeTurn(score)
}
