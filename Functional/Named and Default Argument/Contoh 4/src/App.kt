/*
main function
fun main() {
    val fullName = getFullName(first = "Dicoding")
    print(fullName)
}

fun getFullName(first: String = "Kotlin", middle: String = " is ", last: String = "Awesome"): String {
    return "$first $middle $last"
}
 */
fun main() {
    val fullName = getFullName(first = "Febrian")
    println(fullName)
}

fun getFullName(
    first: String = "Kotlin",
    middle: String = "is",
    last: String = "Awesome"): String {

    return "$first $middle $last"

}
