package com.michalgarnczarski

import scala.util.Random

object Cast {

  def generateCast(diceQuantity: Int): List[Int] = List.fill(diceQuantity)(Random.nextInt(6) + 1)
}
