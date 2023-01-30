package exercises

object Exercises_01 extends App{
  /*
  1. A greeting function (name,age) => "Hi, my name is $name and I am $age years old."
  2. Factorial function 1 * 2 * 3 * 4 ...............* n
  3. A Fibonacci function
      f (1) = 1
      f (2) = 1
      f (n) = f(n - 1) + f(n - 2)
  4. Tests if a number is prime.
  */


//  1. A greeting function (name,age) => "Hi, my name is $name and I am $age years old."
  def greetingForKids (name: String, age: Int): String =
  "Hi, My name is " + name + " and I am " + age + " years old"
  println(greetingForKids("Mohamed", 20))



  //  2. Factorial function 1 * 2 * 3 * 4 ...............* n
  def factorial (n: Int): Int =
    if (n <= 0) 1
    else n * factorial(n - 1)
  println(factorial(5))




  //   3. A Fibonacci function
  def fibonacci(n: Int): Int =
    if (n <= 1) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  println(fibonacci(8))


  //  4. Tests if a number is prime.
  def isPrime (n: Int):Boolean =
    {
      def isPrimeUntill (t: Int):Boolean =
        if (t <= 1) true
        else n % t != 0 && isPrimeUntill(t-1)
      isPrimeUntill(n/2)
    }
  println(isPrime(27))
  println(isPrime(2003))
}
