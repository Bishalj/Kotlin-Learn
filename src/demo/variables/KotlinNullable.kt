package demo.variables

var name: String? = "Bishal"
val id: Int? = 22
fun main() {

    println("${name + id}")
    switchStatement()
    name = null;
    println("${name + id}")
    switchStatement()
    functionWhichDoesNotReturn(name)

}

fun functionWhichDoesNotReturn(name:String?): Unit{
    println("Hi $name")
    println("------------End---------------")
}

private fun switchStatement() {
    when (name) {
        "Bishal" -> println(1)
        null -> println(2)
        else ->
            println(3)
    }

    var newName: String =if(name != null) name!! else "Hi!!";
    println(newName)
}