package demo

abstract class A{
    open fun display(){
        println("Display A Mehtod")
    }

    abstract fun hello()
}

class B : A(){
    override fun display(){
        println("Display B Mehtod")
    }

    override fun hello() {
        println("Hello")
    }
}

fun main(args: Array<String>){

    var a: A = B()
    a.display()
    a.hello()

    var b: B = B()
    b.display()
    b.hello()


}