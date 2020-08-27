package udemy.collections

class Car(val name: String, val model: String, val year: Int) {
  operator fun component1() = name
  operator fun component2() = model
  operator fun component3() = year
}


data class CarDataClass(val name: String, val model: String, val year: Int)

fun main() {
  val car1 = Car("Tata", "Tiago", 2020)
  val (n1, model1, yer1) = car1
  println("Name: $n1, Model: $model1, Year: $yer1")


  val car2 = CarDataClass("Tata", "Tiago", 2020)
  val (n, model, yer) = car2
  println("Name: $n, Model: $model, Year: $yer")
}