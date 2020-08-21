package udemy


fun main(args: Array<String>){
  var emp1: Employee = Employee("B", 1)
  var emp2: Employee = Employee("A", 1)
  var emp3: Employee = Employee("A", 1)

  println(emp1 == emp2)
  println(emp1 === emp2)
  println(emp1.equals(emp2))
  println(emp3 == emp2)
  println(emp3 === emp2)
  println(emp3.equals(emp2))
  var emp4: Any = Employee("A", 1)
  if(emp4 !is Employee)
    println("Emp 4")
  else
    println(emp4.id)


  var w1: String = "12345"
  var w2 = "12345"
  println(w1 == w2)
  println(w1 === w2)

}


data class Employee(val name: String, val id: Int){

  override fun equals(other: Any?): Boolean {
    if(other is Employee)
      return other.id == id && other.name == name
    return false
  }
}