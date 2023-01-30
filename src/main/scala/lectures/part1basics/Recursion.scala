package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App{
  def factorial(n: Int): Int =
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n-1))
      val result = n * factorial(n - 1)
      println("Computed factorial of " + n)

      result
    }
  println(factorial(10))
//  println(factorial(5000)) // -> StackOverFlowError

  def anotherFactorial(n: Int): Int = {
    @tailrec
    def factorialHelper (x: Int, accomulator: Int): Int =
      if (x <= 1) accomulator
      else factorialHelper(x - 1, x * accomulator) // TAIL RECURSION = Use recursive call as the LAST expression
    factorialHelper(n, 1)
  }
  /*
  anotherFactorial(10) = factorialHelper(10,1)
  = factorialHelper(9, 10 * 1)
  = factorialHelper (8, 9 * 10 * 1)
  = factorialHelper (7, 8 * 9 * 10 * 1)
  = .........
  = factorialHelper (2, 3 * 4 * ........ * 10 * 1)
  = factorialHelper (1, 2 * 3 * 4 * ... * 10)
  = 1, 2 * 3 * 4 * ... * 10
  */
  println(anotherFactorial(5000))


  // BIGINT
  def aFactorial(n: Int): BigInt = {
    def afactorialHelper(x: Int, anAccomulator: BigInt): BigInt =
      if (x <= 1) anAccomulator
      else afactorialHelper(x - 1, x * anAccomulator)

    afactorialHelper(n, 1)
  }
  println(aFactorial(5000))

  // WHEN YOU NEED LOOPS, USE_TAIL_RECURSION.
}
