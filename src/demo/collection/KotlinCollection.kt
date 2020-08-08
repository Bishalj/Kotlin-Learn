package demo.collection


fun main() {
    arrayExample()
    mapExample()
    listExample2()
}

fun listExample2() {
    var names: MutableList<String> = mutableListOf("A", "B", "C")
    printList("Hi", names)
//    printList(name:"Hi")
}

fun printList(s: String, names: MutableList<String>) {
    names.forEach { aName -> println("$s $aName") }
}

private fun arrayExample() {
    var arrayData: IntArray = IntArray(3);
    arrayData[0] = 1
    arrayData[1] = 2
    arrayData[2] = 3
    println(arrayData[2])

    var arrayData2: IntArray = intArrayOf(1,2,3,4,5,6);
    println(arrayData2[4])
    println("-----------One")
    for (aValue in arrayData2){
        print("${aValue} ")
    }
    println()
    println("-----------Two")
    arrayData2.forEach {
        print("${it} ")
    }
    println()
    println("-----------Three")
    for((index, value) in arrayData2.withIndex())
        println("$index -> $value")

    println("-----------four")
    arrayData2
            .forEachIndexed { index, value ->
                println("$index -> $value")
            }
}

private fun mapExample(){
    println("-------------------------MAP-------------------")
    var mutableMap: MutableMap<String, Int> = mutableMapOf("A" to 65, "B" to 66, "C" to 67, "D" to 68)
    mutableMap.forEach { key, value ->
        println("Key: $key  ->  Value: $value")
    }

}