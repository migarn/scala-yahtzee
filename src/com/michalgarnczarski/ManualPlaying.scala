package com.michalgarnczarski

import com.michalgarnczarski.InputScanner._

class ManualPlaying extends PlayingMethod {

  def calculateScore(score: Score, cast: List[Int]): Score = {

  }

  def defineAvailableFigures(score: Score): List[Int] = {
    for {i <- List.range(0, 5)
         if score.scores(i) == -1
    } yield i + 1
  }

  def sleep(): Unit = Thread.sleep(1000)

}
