package demo.nullable

fun main() {
    var name: String? = "Bishal"
    println(getModifiedName(name))

    name = null
    println(getModifiedName(name))

}

fun getModifiedName(name: String?): String {
    return name ?: "Hi"
}
