package udemy.collections

fun main() {
	val map = mutableMapOf<Int, String>(
			1 to "Bishal",
			2 to "Akasj",
			3 to "Sagar"
	)
	map
			.map { println("mapping 0 ${it.value}"); it.value.toUpperCase() }

	map
			.map { println("mapping 1 ${it.value}"); it.value.toUpperCase() }
			.find { it.startsWith("A") }

	map
			.asSequence()
			.map { println("mapping 2 ${it.value}"); it.value.toUpperCase() }

	map
			.asSequence()
			.map { println("mapping 3 ${it.value}"); it.value.toUpperCase() }
			.find { it.startsWith("A") }
}