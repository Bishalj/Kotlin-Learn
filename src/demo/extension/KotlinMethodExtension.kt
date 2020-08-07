package demo.extension

class KotlinExtension {
    var name: String? = null
    var db: String? = null

    fun display(){
        println("$name $db")
    }
}

fun main(args: Array<String>){
    val kotlinExtension1: KotlinExtension = KotlinExtension()
    kotlinExtension1.name = "Jaiswal"
    kotlinExtension1.db = "Paytm"

    val kotlinExtension2: KotlinExtension = KotlinExtension()
    kotlinExtension2.name = "Bishal"
    kotlinExtension2.db= "Turtle"

    kotlinExtension1.display()
    kotlinExtension2.display()

    kotlinExtension2.name = kotlinExtension2.mapNames(kotlinExtension1)
    kotlinExtension2.display()



}

fun KotlinExtension.mapNames(kotlinExtension1: KotlinExtension): String? {
    return this.name  + " " + kotlinExtension1.name
}
