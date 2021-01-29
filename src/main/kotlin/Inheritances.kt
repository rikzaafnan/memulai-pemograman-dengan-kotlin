
open class AnimalInheritances(val name:String, val weight:Double, val age:Int, val isCarnivora:Boolean) {
    open fun eat() {
        println("$name sedang makan")
    }

    open fun sleep() {
        println("$name sedang tidur")
    }

}

class Cat(pName:String, pWeight:Double, pAge:Int, pIsCarnivora:Boolean, val funColor:String, val NumberOfFeet:Int)
    :AnimalInheritances( pName, pWeight, pAge, pIsCarnivora ) {

        fun playWithHuman() {
            println("$name bermain bersama Manusia!")
        }

        override fun eat() {
            println("$name sedang memakan Ikan!")
        }

        override fun sleep() {
            println("$name sedang tidur di bantal")
        }
    }

class Fish(pName: String, pWeight: Double, pAge: Int, pIsCarnivora: Boolean, val scaleColor:String, val numberOfFin:Int)
    :AnimalInheritances(pName, pWeight, pAge, pIsCarnivora) {

    fun swim () {
        println("$name berenang di kali ciliwung!")
    }

    override fun eat() {
        println("$name sedang makan pelet!")
    }

    override fun sleep() {
        println("$name tidak tidur lah")
    }
}

class Snake(pName: String, pWeight: Double, pAge: Int, pIsCarnivora: Boolean, val skinColor:String, val isToxic:Boolean)
    :AnimalInheritances(pName, pWeight, pAge, pIsCarnivora) {
        fun bite(korban:String?){

           if (korban != null) {
               println("$name menggigit '$korban' dengan taringnya!")
           } else {
               println("$name tidak menggigit apa apa!")

           }

        }

        override fun eat( ) {
            println("$name makan daging dah pokoknya!")
        }

        override fun sleep() {
            println("$name tidak tidur lah")
        }
    }



fun main() {

    val dicodingCat = Cat("Meni MeowMeow", 3.2, 2, true, "Red", 4)
    dicodingCat.playWithHuman()
    dicodingCat.eat()
    dicodingCat.sleep()

    val dicodingFish= Fish("ikan cupang", 3.0, 1, false, "Blue Yellow", 3)
    dicodingFish.swim()
    dicodingFish.eat()
    dicodingFish.sleep()

    val dicodingSnake = Snake("Phyton", 2.5, 1, true, "Black", true)
    dicodingSnake.bite(null)
    dicodingSnake.eat()
    dicodingSnake.sleep()

    println("\n")
    dicodingSnake.bite(dicodingCat.name)

}