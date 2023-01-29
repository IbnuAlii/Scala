package lectures.part1basics

object Expressions extends App{

  val x = 1 + 2 // Expressions
  println(x)

  println(2 + 3 * 4) // Math Expression
  // Math Operations
  // + - * / & | ^ << >> (right shift with zero extension)

  println(1 == x) // -> False because x is 3
  // == equal
  // != not equal
  // Relation Operations such as: > >= < <=


  // Logical Operations:
  // Unary -> ! not operator
  // Binary -> && (and) , || (or)
  println(!(1 == x))

  // VARIABLES
  var aVariable = 2
  aVariable += 3 //Also works with (-=) ,(*=), (/=) ....side effect
  println(aVariable)


  /* Instructions VS Expressions
      A. Instructions : are something you tell the computer to do
       example : Change a variable, print to the console, or do this

      B. Expression is something that has a value or and or a type.
       */

  // IF expressions   (in Scala "IF" is an Expression)
  val aCondition = true
  val aConditionedValue = if (aCondition) 10 else 3
  println(aConditionedValue)

//  var i = 0
//  while (i < 10){
//    println(i)
//    i += 1
//  }

  // NEVER WRITE THIS AGAIN.
  // EVERYTHING IN SCALA IS AN EXPRESSION!

  val aWirdValue = (aVariable = 3) // its type is unit
  /* unit is a very special type in Scala which is equivalent to void in other languages
   and it just means don't return anything meaningful.
  */

  /* side effects include
  println(), while loop, reassigning.
  */

  // CODE BLOCK EXPRESSION
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "Hello" else "Goodbye"
  }

  //1) DIFFERENCE BETWEEN "hello world" vs print("hello world")

  //-> "hello world" : is a value of type string -> the "hello world" is a string literal
  //-> print("hello world") : is an expression which is a side effect (they are expressions returning a unit)

  //2)
  val someValue = {
    2 < 3
  }
  // it returns boolean value
  println(someValue)


  val someOtherValue = {
    if (someValue) 239 else 986
    42
  }
  println(someOtherValue)
}
