/* main function
fun main() {
    val user = setUser("Alfian", 19)
    println(user)

    printUser("Alfian")
}

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(name: String) {
    println("Your name is $name")
}

 */

fun main() {
    val user = setUser("Pepbri", 25)
    println(user)

    printUser("Pepbri Tisna")
}

fun printUser(name: String) {
    println("Your name is $name")

}

fun setUser(name: String, age: Int): String {

    return "Your name is $name, and you $age years old"
}
