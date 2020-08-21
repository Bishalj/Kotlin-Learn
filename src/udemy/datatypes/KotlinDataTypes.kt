package udemy.datatypes

fun main() {

  var myBoolean = true

  val vacationTime = false

  println(DummyJavaClass().printVacation(vacationTime))
  println(DummyJavaClass().printVacation(myBoolean))

  println(if (vacationTime) "It is Vacation" else "Go To School")
  println(if (myBoolean) "It is Vacation" else "Go To School")

}