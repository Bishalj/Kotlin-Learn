package udemy.`class`

class KotlinAnonymousClass {
  fun display(interfaceM: MustImplement): Unit{
    println("Display: ${interfaceM.implementMethod(22)}")
  }
}

fun main(){
  var kotlinAnonymousClass = KotlinAnonymousClass()
  kotlinAnonymousClass.display(
      object: MustImplement{
        override fun implementMethod(value: Int): String =  "$value Correct"
      }
  )
}



interface MustImplement{
  fun implementMethod(value: Int): String
}