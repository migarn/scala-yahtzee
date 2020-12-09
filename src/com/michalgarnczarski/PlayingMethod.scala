package com.michalgarnczarski

abstract class PlayingMethod {
  def takeTurn(score: Score): Score
}
