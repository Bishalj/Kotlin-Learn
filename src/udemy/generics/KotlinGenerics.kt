package udemy.generics

import java.lang.StringBuilder


fun <T> List<T>.printCollection(){
	for (i in this)
		println(i)

}

fun List<out Number>.printCollection2(){
	this
			.map { it.toInt()  }
			.map{println(it)}
}

fun <T: Number> printCollection3(list: List<T>){
	for (i in list)
		println(i)

}

fun <T> appendables(item1: T, item2: T) where T:CharSequence, T:Appendable{
	println(item1.append(item2))
}

fun main(){
	val list = mutableListOf<Int>(1,2,3,4,5,6,7)
	val list2 = mutableListOf<String>("1","2","3","4","5","6","7")
	var list3 = mutableListOf<Boolean>(true, false)
	list.printCollection()
	list2.printCollection()
	list.printCollection2()
	appendables(StringBuilder("g4g"), StringBuilder("44"))
//	printCollection3(list3)
}