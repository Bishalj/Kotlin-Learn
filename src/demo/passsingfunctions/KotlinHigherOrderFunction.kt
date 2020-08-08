package demo.passsingfunctions

fun runPredicate(names : List<String>, predicate: (String) -> Boolean){
    names.forEach {aName ->
        if(predicate(aName))
            println(aName)
    }
}

fun runPredicateWithNull(names: List<String>?, predicate: ((String) -> Boolean)?){
    names?.forEach { aName ->
        if (predicate != null) {
            if (predicate.invoke(aName))
                println(aName)
        }
        }
    println("Hello")
}

fun main(){
    exampleWithNull()
    exampleWithoutNull()

}

fun exampleWithNull() {
    val predicate: (String) -> Boolean = { aName: String -> aName.startsWith("B") }
    val names: List<String> = mutableListOf("Bishal", "Akash", "Bishuu", "Sagar", "bishal")
    runPredicate(names, predicate)
}

private fun exampleWithoutNull() {
    val predicate: ((String) -> Boolean)? = { aName: String -> aName.startsWith("B") }
    val names: List<String>? = mutableListOf("Bishal", "Akash", "Bishu", "Sagar", "bishal")

    val predicateNull: ((String) -> Boolean)? = null
    val namesNull: List<String>? = null

    runPredicateWithNull(names, predicate)
    runPredicateWithNull(names, predicateNull)
    runPredicateWithNull(namesNull, predicate)
    runPredicateWithNull(namesNull, predicateNull)

    println("-----------------------End------------------")

    if (names != null) {
        names
            .filterNotNull()
            .filter { it.startsWith("B") }
            .associateWith { it.length }
            .forEach{println("${it.key} ${it.value}")}
    }

}