package udemy.`class`

fun main() {
  var data: String = "how are you"
  println(data.convertToTitleCase())
}

fun String.convertToTitleCase(): String{
  return this.substring(0,1).toUpperCase() + this.substring(1)
}

open class first(val data: Int): second(data){}
open class second(val data2: Int){}


interface Test{
  val data: Int

  fun display(): String
}