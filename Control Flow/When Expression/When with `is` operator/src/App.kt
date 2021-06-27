/* main function
fun main() {
    val anyType : Any = 100L
    when(anyType){
        is Long -> println("the value has a Long type")
        is String -> println("the value has a String type")
        else -> println("undefined")
    }
}
 */
fun main() {
    val anyType : Any = 100L
    when(anyType) {
        is Long -> println("the value has Long Type")
        is String -> println("the value has a String Type")
        else -> println("undefined")
    }
}