package demo.variables

interface AgeRestrictoin{
    fun age(): Int
}

class KotlinCompanion{
    val name = "Akash"
    companion object factory : AgeRestrictoin{
        val name: String = "Bishal"

        override fun age(): Int {
            return 27
        }
    }

}

fun  main(){
    var kotlinCompanionObj: KotlinCompanion = KotlinCompanion()

    println(KotlinCompanion.factory.name)
    println(KotlinCompanion.name)
    println(KotlinCompanion.age())

    print(kotlinCompanionObj.name)
}