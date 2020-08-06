package demo

import java.util.*

fun main(args: Array<String>) {
        println("Its working");

        val name = "Bishal"; //its immutable
        var age = 27
        age = 28

        var myAge: Int = 27

        println("My age: " + age)
        println("My age:" +
                " $age")

        var letterGrade: Char = 'A';
        println("letter grade is $letterGrade")
        println("letter grade is ${letterGrade is Char}")

        if (true is Boolean)
            println("Boolean")

        //casting
        var doubleNum: Double = 3.14
        var intNum: Int = doubleNum.toInt()
        println("Integer is: $intNum")
        println("A to int: " + 'A'.toInt())

        var fName: String = "Bishal"
        var lName: String = "Jaiswal"
        println("Name: $fName $lName")
        println("Name: ${fName.length} + ${lName.length}")
        println("Name: ${fName.length + lName.length}")

        var letter: Char = 'B'
        println("$letter")

        var word: String = "I am fine";
        System.out.println(word);

    arrayExample()
    listExample()
    hashMapExample()
    loopingExample()
    controlFlow()

}

fun controlFlow() {
    //switch
    var value: Int = 2
    when(value){
        1 -> println("One")
        2 -> println("Two")
        else -> println("None")
    }

    var value2: Int = 3
    when(value2){
        1,2 -> println("One")
        else -> println("None")
    }
}

fun loopingExample() {
    for (j in 1..5)
        print("$j ")
    println()
    val items: List<Int> = mutableListOf(1,2,3,4,5,6)
    for (aItem in items)
        print("$aItem ")
    println()
    println("-------------List index------------")
    for ((index, value) in items.withIndex())
        println("$index -> $value")
    println()
}

fun hashMapExample() {
    var linkedHashMapMapData: MutableMap<Int, Int> = mutableMapOf()
    linkedHashMapMapData[1] = 1
    linkedHashMapMapData[2] = 2
    linkedHashMapMapData.put(3,3)

    println("linked hash map value: " + linkedHashMapMapData[2])
    println("linked hash map value: " + linkedHashMapMapData.get(2))

    linkedHashMapMapData
            .entries
            .forEach { data ->
                println("${data.key} ->  ${data.value}")
            }

    var hashMapMapData: MutableMap<Int, Int> = hashMapOf()
    hashMapMapData[1] = 1
    hashMapMapData[2] = 2
    hashMapMapData.put(3,3)
    hashMapMapData
            .entries
            .forEach { data ->
                println("${data.key} ->  ${data.value}")
            }

    var treeSet: TreeSet<Int> = TreeSet<Int>();
}

fun listExample() {
    val listData: MutableList<Int> = mutableListOf();
    val immutableList: List<Int> = listData
    listData.add(1);
    listData.add(2);
    listData.add(3);
    listData.add(4);
    listData.add(5);
    listData.remove(2);

    println("---------------Start List---------------")
    listData
            .filter {  data -> data%2 != 0 }
            .forEach{data ->
                print(data)
                print(" ")
            }
    println()
    println(listData)

    listData
            .filter { it != 1 }
            .forEach{
                print(it)
                print(" ")
            }
    println()
    println(listData)
    println(immutableList)

}

private fun arrayExample() {
    var arrayData: IntArray = IntArray(3);
    arrayData[0] = 1
    arrayData[1] = 2
    arrayData[2] = 3
    println(arrayData[2])

    var arrayData2: IntArray = intArrayOf(1,2,3,4,5,6);
    println(arrayData2[4])
}
