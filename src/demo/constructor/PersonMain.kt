package demo.constructor

fun main(){
    val person: Person = Person("Bishal", 25);
    println(person.name)
    println(person.age)
    person.nickName = "Tamil"
    println(person.nickName)

    person.name = "Akash"
    person.age = 29

    println(person.name)
    println(person.age)
    // if you want the nickname to change whenever the name is changing the add getter setter
    println(person.nickName)


}