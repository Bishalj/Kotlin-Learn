package udemy.collections

fun main() {
  val evenNumber: Array<Int> = Array(16) { i -> i*2}

  val intArray: IntArray = intArrayOf(1,2,3)
  val longArray: LongArray = longArrayOf(1,2,3)
  val doubleArray: DoubleArray = doubleArrayOf(1.0,2.0,3.22)
  val boolArray: BooleanArray = booleanArrayOf(true)

//  val my1 = Array<Int>(5) not allowed for Array
  var my2: IntArray = IntArray(5)
  var my3: Array<Int> = intArray.toTypedArray()

  evenNumber
      .forEach { println(it) }
}