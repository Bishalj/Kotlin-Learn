package demo.extension

import java.util.*

class KotlinObjectExtension {
    fun appendNames(name: String) {
        names
                .add(name)
    }

    fun findName(searchName: String) {
        println(
                names
                        .stream().filter { aName: String -> aName == searchName }
                        .findAny()
                        .get()
        )
    }

    companion object {
        private val names: MutableList<String> = ArrayList()
        fun display() {
            println(names)
        }

        @JvmStatic
        fun main(args: Array<String>) {
            val kotlinObjectExtension = KotlinObjectExtension()
            kotlinObjectExtension.appendNames("Bishal")
            kotlinObjectExtension.appendNames("Sagar")
            kotlinObjectExtension.appendNames("Akash")
            display()
            kotlinObjectExtension.findName("Sagar")
            kotlinObjectExtension.findName("no data")
        }
    }
}

fun main(args: Array<String>) {
    val kotlinObjectExtension = KotlinObjectExtension()
    kotlinObjectExtension.appendNames("Bishal")
    kotlinObjectExtension.appendNames("Sagar")
    kotlinObjectExtension.appendNames("Akash")
    KotlinObjectExtension.display()
    kotlinObjectExtension.findName("Sagar")
    kotlinObjectExtension.findName("no data")
}