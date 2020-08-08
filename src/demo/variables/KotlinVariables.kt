package demo.variables

import demo.dataclass.Employee
import java.util.*

class KotlinVariables{
    var number: Int? = null;
    val employee: Employee = Employee("Bishal", "Kolkata", 27, Date());

}
fun main(args: Array<String>) {
    val kotlinVariables:KotlinVariables = KotlinVariables()
    println(kotlinVariables.employee.name)
    kotlinVariables.employee.name = "Jaiswal"
    println(kotlinVariables.employee.name)
}