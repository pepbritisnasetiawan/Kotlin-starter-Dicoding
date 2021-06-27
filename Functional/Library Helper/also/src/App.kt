/*
main function
fun main() {
    val text = "Hello Kotlin"
    val result = text.also {
        println("value length -> ${it.length}")
    }

    println("text -> $result")
}
 */
fun main() {
    val text = "Wooah Okeee"
    val result = text.also {
        println("nilai panjangnya = ${it.length}")
    }
    println("Text = $result")
}