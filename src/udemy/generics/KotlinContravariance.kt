package udemy.generics

interface FLowersCare<in T> {

	fun prune(flower: Flowers){
		var type =""
		if(flower is RoseFlower)
			type = "rose"
		else if(flower is DaisyFlower)
			type = "daisy"
		println("I am prunning a $type")
	}
}

open class Flowers{}

class RoseFlower: Flowers()
class DaisyFlower: Flowers()


class Gardens<T: Flowers>(private val flowers: List<T>, private val fLowersCare: FLowersCare<T>){
	fun pickFlower(i : Int) = flowers[i]
	fun prunning(i : Int) = fLowersCare.prune(pickFlower(i))
}

fun main(){
//		var roseTender = object: FLowersCare<RoseFlower> {
//			override fun prune(flower: RoseFlower) {
//				println("I am prunning a rose")
//			}
//		}
//
//		var daisyTender = object: FLowersCare<DaisyFlower> {
//			override fun prune(flower: DaisyFlower) {
//				println("I am prunning a Daisy")
//			}
//		}
			var flowerTender = object: FLowersCare<Flowers> {
			override fun prune(flower: Flowers) {
				println("I am prunning a Daisy")
			}
		}

		var roseGarden = Gardens<RoseFlower>(listOf(RoseFlower(), RoseFlower(), RoseFlower()), flowerTender)
//		var daisyGarden = Gardens<DaisyFlower>(listOf(DaisyFlower(), DaisyFlower(), DaisyFlower()), daisyTender)
		roseGarden.prunning(2)
//		daisyGarden.prunning(1)
}
