package udemy.nullreferences

import java.lang.Exception
import java.time.OffsetDateTime

fun main() {
  var str: String? = null
  println("What happens if it is empty : ${str?.toUpperCase().toString()}")
  println("What happens if it is empty : ${str?.toUpperCase().toString()}")
  println("Elvis operator: ${str ?: "Elvis rocks"}")

  var str2: String? = "Bishal"
  println("What happens if it is empty : ${str2?.toUpperCase().toString()}")
  println("Elvis operator: ${str2 ?: "Elvis rocks"}")

  var str3: String = "Bishal"
  println("What happens if it is empty : ${str3.toUpperCase()}")
  println("Elvis operator: ${str3}")

  //null assertions

  var data: String? = "bishal"
  displayValue(data)


  data = "Bishal"
  data?.let { displayWithoutNullValue(it) }

  displayWithoutNullValue(data!!)


  data =null
  displayValue(data)
//  OffsetDateTime()

}

fun displayValue(data: String?) {
  println(data!!.toUpperCase())
}


fun displayWithoutNullValue(data: String) {
  println(data.toUpperCase())
}