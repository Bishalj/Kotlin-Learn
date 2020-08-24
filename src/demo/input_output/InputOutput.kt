package demo.input_output

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

    A(1,2,"A1").printDescription()
}


class A(a1: Int, private var a2: Int, s1: String): B2(a1, s1){
    override fun printDescription(){
        super.printDescription()
        println("a2: $a2")
    }
}

open class B2(private val a1: Int, val s1: String) {
    open fun printDescription(){
        println("Data a1: $a1, s1: $s1")
    }
}
