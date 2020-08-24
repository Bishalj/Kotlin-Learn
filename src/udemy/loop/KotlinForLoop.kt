package udemy.loop

fun main() {
  var a = 1..5
  println(2 in a)
  var backwardRange = 5.downTo(1)
  println(2 in backwardRange)

  var stepRange = backwardRange.step(2)
  for(i in stepRange)
    println("StepRange: $i")

  for( i in 0..20 step 5)
    println("loop to: $i")

  for( i in 20 downTo 5 step 5)
    println("Down to: $i")

  //exclude
  for(i in 1 until 10)
    println("Exclude: $i")

  var arr = listOf<Int>(1,2,3,4,5,6)
  println(3 in arr)
  println(3 !in arr)

  for(index in arr.indices)
    println("Index values: ${arr[index]}")

  for((index, value) in arr.withIndex())
    println("Index $index, values: $value")

  //labelled break
  iloop@ for(i in 1..20){
    for(j in 1..5){
      if(i == 3)
        break@iloop
      println("i=$i -> j=$j")
    }
  }
  val value = readLine()!!.toInt()
  var data = if(value > 20){
    print(value)
    " greater than 20"
  }else{
    print(value)
    " less than 20"
  }
  println(data)
}