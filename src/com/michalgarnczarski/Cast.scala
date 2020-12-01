package com.michalgarnczarski

import scala.util.Random

object Cast {

  private def randomDiceValue: Int = Random.nextInt(6) + 1

  def generateCast(diceQuantity: Int): List[Int] = List.fill(diceQuantity)(randomDiceValue)

  def reviseCast(cast: List[Int]): List[Int] = cast.map(dice => if (dice == 0) randomDiceValue else dice)
}
