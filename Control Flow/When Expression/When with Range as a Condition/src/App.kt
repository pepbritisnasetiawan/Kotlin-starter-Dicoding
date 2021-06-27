/* main function
fun main() {
    val value =  27
    val ranges = 10..50

    when(value){
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
        else -> println("value undefined")
    }
}
 */
fun main() {
    val value = 25
    val ranges = 1..100

    when(value){
        in ranges -> println("value is in the range")
        !in ranges -> println("Value is outside the range")
        else -> println("value undefined")
    }
}