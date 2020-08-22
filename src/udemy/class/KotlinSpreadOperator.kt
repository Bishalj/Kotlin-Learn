package udemy.`class`

fun main() {
  var arr1 = arrayOf(1,2,3)
  var arr2 = arrayOf(1,2,3)
  var num1 = 1
  var result1 = arrayOf(arr1, arr2, num1)
  for(data in result1)
    println(data)
  println("---------------------------------------------------")
  var result2 = arrayOf(*arr1, *arr2, num1)
  for(data in result2)
    println(data)
}
