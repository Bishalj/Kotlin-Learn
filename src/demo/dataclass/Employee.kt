package demo.dataclass

import java.util.*

data class Employee(var name: String, var address: String, var age: Int, var dateOfJoining: Date) {
}

fun main() {
    val employee: Employee = Employee("Bishal", "Kolkata", 27, Date())
    println("${employee.name} ${employee.address} ${employee.age} ${employee.dateOfJoining}")
}