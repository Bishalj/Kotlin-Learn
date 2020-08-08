package demo.input_output

import com.sun.org.apache.xpath.internal.operations.Bool

fun main(){
    var a = readLine()
    var b = readLine()?.toInt()
    println(b)
    println(a)
    val num1 = 10
    val num2 =20
    val result = if (num1 > num2) {
        "$num1 is greater than $num2"
    } else {
        "$num1 is smaller than $num2"
    }
    println(result)
}

