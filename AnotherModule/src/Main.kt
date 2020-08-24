import udemy.`class`.KotlinAnonymousClass
import udemy.`class`.MustImplement

fun main(){
  var kotlinAnonymousClass = KotlinAnonymousClass()
  kotlinAnonymousClass.display(
      object: MustImplement {
        override fun implementMethod(value: Int): String =  "$value Correct"
      }
  )
}
