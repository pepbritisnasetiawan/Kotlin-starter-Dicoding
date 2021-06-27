import kotlinx.coroutines.processNextEventInCurrentThread

/* type your solution here
fun main() {
    val statement = "Kotlin is \"Awesome!\""
    println(statement)
}

 */

fun main() {
    val word = "Pepbri is \"Awesome!\""
    val tabWord = "Pepbri is \tawesome"
    val newLine = "Pepbri is \nAwesome"
    val singQuote = "Pepbri is \'Awesome'"
    val backSlash = "Pepbri is \\Awesome"

    println(word)
    println(tabWord)
    println(newLine)
    println(singQuote)
    println(backSlash)
}