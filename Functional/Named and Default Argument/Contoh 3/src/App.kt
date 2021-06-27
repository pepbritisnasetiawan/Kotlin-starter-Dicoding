/*
main function
fun main() {
    val fullName = getFullName()
    print(fullName)
}

fun getFullName(
        first: String = "Kotlin",
        middle: String = " is ",
        last: String = "Awesome"): String {
    return "$first $middle $last"
}
 */

fun main() {
    val fullName = getFullName()
    println(fullName)
}

fun getFullName(
    first : String = "Kotlin",
    middle: String = "is",
    last: String = "Awesome"
): String {

    return "$first $middle $last"
}
