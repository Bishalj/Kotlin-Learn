package udemy.generics

import java.util.concurrent.Flow

class Garden< out T: Flower>{

	fun plantFlower(flowerType: String){
		println("Planting flower of type $flowerType")
	}
	private val flowers = listOf<T>()
	fun pickFlower(i: Int) = flowers[i]
}

abstract class Flower{
	abstract val flowerType: String
	abstract fun display()
}

class Rose(override val flowerType: String) : Flower(){
	override fun display() {
		println("Rose Class")
	}
}

class Daisy(override val flowerType: String) : Flower(){
	override fun display() {
		println("Daisy Class")
	}
}

fun main() {
	val rose: Rose = Rose("rose")
	val daisy: Daisy = Daisy("daisy")
	rose.display()
	daisy.display()
	val roseGarden = Garden<Rose>()
	callDaisyGarden(roseGarden)
}

fun callDaisyGarden(rose: Garden<Rose>){
	displayGarden(rose)
}


fun displayGarden(daisy: Garden<Flower>){
	println("Garden")
}