package exercises

import scala.annotation.tailrec

object Exercise_02 extends App {
  /*
  * 1. Concatenate a string n times
  * 2. IsPrime function tail recursive
  * 3. Fibonacci function, tail recursive
  */

//  * 1. Concatenate a string n times
  @tailrec
  def concatenateTailRec (aString: String, n: Int, accomulator: String): String =
    if (n <= 0) accomulator
    else concatenateTailRec(aString, n-1, aString + accomulator)

  println(concatenateTailRec("Helo",3,""))

//    * 2. IsPrime function tail recursive
  def isPrime(n: Int): Boolean = {
    @tailrec
    def isPrimeTailRec (t: Int, isStillPrime: Boolean):Boolean =
      if (!isStillPrime) false
      else if (t <= 1) true
      else isPrimeTailRec(t - 1, n % t != 0 && isStillPrime)
    isPrimeTailRec(n/2, true)
  }
  println(isPrime(2003))
  println(isPrime(629))

//    * 3. Fibonacci function, tail recursive
def fibonacci(n: Int): Int = {
  def fiboTailrec (i: Int, last: Int, nextToLast: Int): Int =
    if (i >= n) last
    else fiboTailrec(i + 1, last +  nextToLast, last)
  if (n <= 2) 1
  else fiboTailrec(2,1,1)
}
println(fibonacci(8))
}
