package demo

class KotlinClassPractice {

    private var name: String = "Bishal"

    fun display(){
        println(name);
    }
}


class KotlinNestedClassPractice {

    class Nested {
        fun display(value : Int)  = println(value)
    }
}

class KotlinConstructor(var name: String, val age: Int){
    lateinit var address: String

    constructor(name: String, age: Int, address: String):this(name, age){
        this.address = address;
    }
}

class KotlinSetterGetter{
    lateinit var name: String

}


fun main(args: Array<String>){
    var kotlinClassPractice: KotlinClassPractice = KotlinClassPractice();
    kotlinClassPractice.display()

    var kotlinNestedClassPractice: KotlinNestedClassPractice.Nested = KotlinNestedClassPractice.Nested();
    kotlinNestedClassPractice.display(5)

    var kotlinConstructor: KotlinConstructor = KotlinConstructor("Bishal", 27);
    println("${kotlinConstructor.name} , age: ${kotlinConstructor.age}")

    var kotlinConstructor2: KotlinConstructor = KotlinConstructor("Bishal", 27, "Manicktalla");
    println("${kotlinConstructor2.name} , age: ${kotlinConstructor2.age} , address: ${kotlinConstructor2.address}")

    var kotlinSetterGetter: KotlinSetterGetter = KotlinSetterGetter()
    kotlinSetterGetter.name = "Bishal jaiswal"
}