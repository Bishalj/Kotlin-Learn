package demo.variables

fun main(){
    var names: Array<String> = arrayOf("A", "B", "C")
    printVarags(*names)
    display(name = "Akash")
    display()
}

fun printVarags(vararg names: String){
    names
            .forEach { println(it) }
}

fun display(name: String = "Bishal", address: String = "Kolkata"){
    println("$name $address")
}