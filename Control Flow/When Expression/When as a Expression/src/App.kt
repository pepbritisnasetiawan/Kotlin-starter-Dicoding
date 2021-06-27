/* main function
fun main() {
    val value = 7
    val stringOfValue = when (value) {
        6 -> "value is 6"
        7 -> "value is 7"
        8 -> "value is 8"
        else -> "value cannot be reached"
    }

    println(stringOfValue)
}
 */

fun main() {
    val value = 7
    val stringOfValue = when(value){
        6 -> "Value is 6"
        7 -> "Value is 7"
        8 -> "Value is 8"
        else -> "Value cannot be reached"
    }
    println(stringOfValue)
}