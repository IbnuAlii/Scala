package lectures.part1basics

object Functions extends App{
  def aFunction(a: String, b: Int): String = {
    a + " " + b
  }
  println(aFunction("hello",3))


  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())

  def aRebeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRebeatedFunction(aString, n-1)
  }
  println(aRebeatedFunction("hello", 3))
  // WHEN YOU NEED LOOPS, USE RECURSION.

  def aFunctionWithSideEffects(aString: String):  Unit = println(aString)

  def aBigFunction (n: Int): Int = {
    def aSmallerFunction (a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }
}
