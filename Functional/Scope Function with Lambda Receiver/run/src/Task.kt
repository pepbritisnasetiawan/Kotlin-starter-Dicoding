/*
fun main() {
    val text = "Hello"
    val result = text.run {
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "replace text from $from to $to"
    }
    println("result : $result")
}
 */
fun main() {
    val text = "Aloha"
    val result = text.run {
        val from = this
        val to = this.replace("Aloha", "Hello")
        "Replace text from $from to $to"
    }
    println("Hasilnya -> $result")
}