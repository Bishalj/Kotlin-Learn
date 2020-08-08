package demo.sealedclass

import java.io.BufferedReader
import java.io.File
import java.io.InputStreamReader

sealed class SealedClass {
    class SealedClass1: SealedClass()
    class SealedClass2: SealedClass()
}

fun main(args: Array<String>) {
    val obj: SealedClass = SealedClass.SealedClass1()

    val output = when (obj) { // defining the object of the class depending on the inuputs
        is SealedClass.SealedClass1 -> "Option One has been chosen"
        is SealedClass.SealedClass2 -> "option Two has been chosen"
    }
    println(output)
}

val names:(String) -> Unit = {s:String -> print(s)}
val names2: (String) -> Int = { s:String -> 1}
