class User(val name:String, val age:Int) {
    override fun toString():String {
      return "User (name=$name, age=$age)"
    }

}

data class DataUser(val name:String, val age:Int) {
    fun intro() {
        println("My name is $name, I am $age years old")
    }
}

class Animal ( val name:String,
               val weight:Double,
               val age: Int,
               val isMammal: Boolean
        ) {
    fun eat() {
        println("$name makan!")
    }
    fun sleep() {
        println("$name tidur!")
    }
}

fun main() {

//    val anyList = listOf('a', "Kotllin", 3, true)
//
//    println(anyList)

    val dicodingCat = Animal("Dicoding MeowMeow", 4.2, 1, true)
    println("Nama : ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia:${dicodingCat.isMammal}")

    dicodingCat.eat()
    dicodingCat.sleep()

}