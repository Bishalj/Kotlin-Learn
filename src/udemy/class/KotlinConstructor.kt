package udemy.`class`

import demo.KotlinConstructor

fun main(){
  var kotlinSetterGetter = KotlinSetterGetter("Bishal", "jaiswal")
  println(kotlinSetterGetter.lName)
  kotlinSetterGetter.lName = "Kotlin"
  println(kotlinSetterGetter.lName)
}

class KotlinConstructor1 constructor(fName: String){

  val fName: String;

  init {
    this.fName = fName
  }
}

class KotlinConstructor2 constructor(fName: String){

  val fName: String = fName;
}

class KotlinConstructor3 constructor(val fName: String){
}

class KotlinConstructor4(var fName: String){
}

class KotlinConstructor5 protected constructor(val fName: String){
}

class KotlinSetterGetter constructor(val fName: String, lName: String){

  var lName = lName
  get(){
    return "bishal $field"
  }
  set(value){
    field = "Rocks $value "
  }
}