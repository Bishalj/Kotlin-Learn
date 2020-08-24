package udemy.`when`

fun main(){

  while(true) {
    when (val data = readLine()!!.toInt()) {
      1, 2 -> println(data)
      3 -> println("data is$data")
      in 30..40 -> println("In Range: 30 - 40")
      else -> println("Else: $data")
    }

    var y = 50
    when(val data = readLine()!!.toInt()){
      y + 20 -> println(data)
      y - 20 -> println(data)
    }

    when(val data = readLine()!!.toInt()){
      is Int -> println(data is Int)
    }
  }
}