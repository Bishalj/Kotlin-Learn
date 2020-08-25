package udemy.lambda

import java.lang.StringBuilder

fun main() {
  run { println("I am in a lambda")}

  var employees: List<Employee> = listOf(
      Employee("Bishal", "Jaiswal", 2017),
      Employee("Akash", "Jaiswal", 2013),
      Employee("Sagar", "Jaiswal", 2020)
  )
  println(
      employees
        .minBy { it.joiningYear }
  )
  println(employees.minBy(Employee::joiningYear))
  var num = 20
  run {
    num += 25
    println(num)
  }
  println(countTo100())
  println(countTo100V2())
  println(countTo100V3())
}

fun countTo100(): String{
  val numbers = StringBuilder()
  return with(numbers){
    for(i in  1..99)
      append("$i, ")
    append(100)
    toString()
  }
}

fun countTo100V2(): String =
    with(StringBuilder()){
      for(i in  1..99)
        append("$i, ")
      append(100)
      toString()
    }

fun countTo100V3(): String =
    StringBuilder().apply{
      for(i in  1..99)
        append("$i, ")
      append(100)
    }.toString()
data class Employee(val firstName: String, val lastName: String, val joiningYear: Int)