/* main function
fun main() {
    val length = messageLength("Hello From lambda")
    println("Message length $length")
}

val messageLength = { message: String -> message.length }

 */
fun main() {
    val length = messageLenght("Semangat belajar kotlinnya!")
    println("Message lenght $length")
}

val messageLenght = { message: String -> message.length }