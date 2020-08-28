package udemy.generics

fun main() {
	display(listOf(1,2,"Bishal", 4, "Akash Jaiswal"))
	println(getElementsOfTypeT<String>(listOf(1,2,"Bishal", 4, "Akash Jaiswal")))
	println(getElementsOfTypeT<Int>(listOf(1,2,"Bishal", 4, "Akash Jaiswal")))
	println(getElementsOfTypeT<Boolean>(listOf(1,2,"Bishal", 4, "Akash Jaiswal", true)))
}


fun <T: Any> display(list: List<T>){
	list.forEach{
		if(it is String)
			println(it)
	}
}

inline fun <reified T> getElementsOfTypeT(list: List<Any>): List<T>{
	val res: MutableList<T> = mutableListOf()
	list.forEach{
		if(it is T)
			res.add(it)
	}
	return res
}