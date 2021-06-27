/* main function
fun main() {
    val value = 7
    val stringOfValue = when (value) {
        6 -> {
            println("Six")
            "value is 6"
        }
        7 -> {
            println("Seven")
            "value is 7"
        }
        8 -> {
            println("Eight")
            "value is 8"
        }
        else -> {
            println("undefined")
            "value cannot be reached"
        }
    }

    println(stringOfValue)

}
 */

fun main() {
    val value = readLine()?.toInt()
    val stringOfValue = when(value) {
        6 -> {
            print("Six")
            "Value is 6"
        }
        7 -> {
            print("Seven")
            "Value is 7"
        }
        8 -> {
            print("Eight")
            "Value is 8"
        }
        else -> {
            print("value cannot be reached")
            "Value cannot defined"
        }
    }

    println(stringOfValue)
}