package udemy.`class`

class NormalClass(val name: String)
data class DataClass(val name: String)

fun main(){
  var normalClass1: NormalClass = NormalClass("Bishal")
  var normalClass2: NormalClass = NormalClass("Bishal")
  println(normalClass1)
  println(normalClass2)
  println(normalClass1 == normalClass2)


  var dataClass1: DataClass = DataClass("Bishal")
  var dataClass2: DataClass = DataClass("Bishal")
  println(dataClass1)
  println(dataClass2)
  println(dataClass1 == dataClass1)
  var dataClass3 = dataClass1.copy()
  println(dataClass3)
  println(dataClass1 == dataClass3)
  var dataClass4 = dataClass1.copy(name="Testing")
  println(dataClass4)
  println(dataClass1 == dataClass4)
}