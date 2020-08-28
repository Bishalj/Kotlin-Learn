package udemy.collections

fun main() {
  val set = setOf(1,2,3,5,6)

  println(set.plus(7))
  println(set.plus(9))
  println(set.plus(2))
  println(set.minus(2))
  println(set.minus(200))
  println(set.drop(3))
  println(set.drop(300))
  println(set.average())
  println(set.min())
  println(set.max())


  val mutableSet = mutableSetOf(1,2,3,5,6)
  println(mutableSet.plus(30))
  println(mutableSet)


}