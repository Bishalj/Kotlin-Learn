package udemy.`class`


fun main() {
  display("a", "b",  "c", numb = 1)
}
private fun display(vararg data : String, numb: Int){
  println(numb)
  for(aData in data)
    println(aData)
}

