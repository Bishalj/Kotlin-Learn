package udemy.lambda

fun findByLastName(lastname: String): Boolean{

  var employees: List<Employee> = listOf(
      Employee("Bishal", "Jaiswal", 2017),
      Employee("Akash", "Jaiswal", 2013),
      Employee("Sagar", "Jaiswal", 2020)
  )

  employees
      .forEach {
        if(it.lastName == lastname)
          return true
      }

  return false
}


fun findByLastNameLocalReturnExample(lastname: String){

  var employees: List<Employee> = listOf(
      Employee("Bishal", "Jaiswal", 2017),
      Employee("Akash", "Jaiswal", 2013),
      Employee("Sagar", "Jaiswal", 2020)
  )

  employees
      .forEach returnBlock@ {
        if(it.lastName == lastname) {
          println("Yes")
          return@returnBlock
        }
      }

  println("No")
}