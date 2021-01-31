

fun main() {

//    val someNullValue:String? = "null"

//    lateinit var someMustNullValue:String

//    try {
//        someMustNullValue = someNullValue!!
//    } catch (e: Exception) {
//        someMustNullValue = " Nilai String Null"
//    } finally {
//        println(someMustNullValue)
//    }

    val someStringValue:String? = "12.0"
    var someIntValue:Int = 0


    try {
        someIntValue = someStringValue!!.toInt()
    } catch (e: NullPointerException) {
        someIntValue = 0
    } catch (e: NumberFormatException) {
        someIntValue = -1
    } finally {
        when(someIntValue) {
            0 -> println("Catch blok NullPointerException terpanggil !!")
            -1 -> println("Catch blok NumberFormatException terpanggil !!")
            else -> println(someIntValue)
        }
    }

}