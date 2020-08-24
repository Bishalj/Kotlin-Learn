package udemy.exceptionHandling

import java.lang.IllegalArgumentException

fun main() {
  try{
    throw IllegalArgumentException("Exception")
  }catch (e: Exception){
    println("Data ${e.stackTrace}")
  }finally {
    println("Finally block")
  }

  println(exceptionFun())


  try{
    throw IllegalArgumentException("Exception 3")
  }finally {
    println("Finally block")
  }
}

fun exceptionFun(): Int {
  return try{
    throw IllegalArgumentException("Exception 2" )
    2
  }catch (e: Exception){
    println(0)
    0
  }finally {
    println(5)
    5
  }

}
