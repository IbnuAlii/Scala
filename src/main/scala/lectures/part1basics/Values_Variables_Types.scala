package lectures.part1basics

object Values_Variables_Types extends App{
 val x: Int = 42
 println(x)

 val y: Int = 100
 println(y)

 //VALS ARE IMMUTABLE
// x=2

 // COMPILER can infer types
 //-> we don't need to specify types
 val s = 120

  // Strings
  val str: String = "hello"
  val anotherStr = "Good bye"

  //BOOLEAN
  val isValid: Boolean = false

  //CHARACTER
  val ch: Char = 'l'

  // INT
  val z: Int = x

  // SHORT
  val ashort: Short = 4136

  // LONG
  val aLong: Long = 1243356755676867L

  // FLOAT
  val aFloat: Float = 2.0f

  // DOUBLE
  val aDouble = 3.134

  // Variables
  // are created by prefixing by keyword "var"
  var aVariable: Int = 7
   // vars are Mutable
    aVariable = 6 // side effect
}
