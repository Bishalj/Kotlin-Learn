package demo.constructor

class Person(var name: String, var age: Int) {
    var nickName: String? = null
        get() = field
        set(value) {
            field = value
            println("Set valueL $value")
        }

}