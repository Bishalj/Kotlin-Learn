package demo.parameters

fun main() {
    sum()
    sum(8,0,"Saggy")
    sum(b=8, name="Saggy")
    val myLambda: (Int) -> Int = { n: Int -> 5*n}
    println(sum(6, myLambda))
}

fun sum(a: Int=3, b: Int=7, name: String = "Bishal"){
    println("${a+b}  -> $name")
}

fun sum(a:Int, myLambda: (Int) -> Int):Int{
    return myLambda(a)
}


