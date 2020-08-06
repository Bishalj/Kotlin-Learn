package demo



interface KotlinInterface{
    var name: String
    var age: Int
    var address: String

    fun displayName()

    fun displayAge() = println("Display age $age")

    fun displayAddress(){
        println("Display address: $address")
    }
}

class KotlintInterfaceImpl(override var name: String, override var age: Int, override var address: String) : KotlinInterface{

    override fun displayName() {
        println("Name is $name")
    }

    override fun displayAge() {
        println("Name is $age")
    }
}

fun main(args: Array<String>){
    val kotlinInterface: KotlinInterface = createKolinInterfaceImpl();
    kotlinInterface.displayName()
    kotlinInterface.displayAddress()
    kotlinInterface.displayAge()
}

private fun createKolinInterfaceImpl() = KotlintInterfaceImpl("Bishal", 27, "Kolkata")


