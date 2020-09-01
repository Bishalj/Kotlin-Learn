package udemy.assignmnet

class Person( val firstName: String,  val lastName: String,  val age: Int){
	operator fun component1() = firstName
	operator fun component2() = lastName
	operator fun component3() = age
}

data class PersonData( val firstName: String,  val lastName: String,  val age: Int){}

fun main() {
	val joe = Person("Joe", "Jones", 45)
	val (firstName, lastName, age) = joe

	val jonas = PersonData("Jonas", "Jones", 45)
	val (firstName2, lastName2, age2) = joe

	val rock = Person("Rock", "Smith", 25)
	val jackie = Person("Jackie", "chan", 55)
	val bishal = Person("Bishal", "Jaiswal", 25)
	val tom = Person("Tom", "Smith", 65)
	val uncle = Person("Uncle", "Martin", 85)

	val map = mapOf(
			"joe" to joe,
			"jackie" to jackie,
			"rock" to rock,
			"bishal" to bishal,
			"tom" to tom,
			"uncle" to uncle
	)

	println(map
			.filter { it.value.lastName.startsWith("S") }
			.count())

	val mapNames: List<Pair<String, String>> =
			map
					.map { Pair(it.value.firstName, it.value.lastName) }

	val firstNames = map.map { it.value.firstName }
	val lastNames = map.map { it.value.lastName }
	println(firstNames.zip(lastNames))
	println(mapNames)

	val list1 = listOf(1,2,3,4,5)
	val list2 = listOf(1,4,3,9,52)
	val unions = list1.union(list2)
	val intersections = list1.intersect(list2)
	val intersection2 = list1.filter { list2.contains(it) }
	println(unions)
	println(intersections)
	println(intersection2)

	val regularPaper =  Box<Regular>()
	val premiumPaper =  Box<Premium>()
	var paper =  Box<Paper>()
	paper = regularPaper
}


class Box<out T>{

}

open class Paper

class Regular: Paper()
class Premium: Paper()