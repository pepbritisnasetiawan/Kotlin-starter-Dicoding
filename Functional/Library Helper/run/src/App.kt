/*
main function
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
    val text = "Ngantuk broo!"
    val result = text.run {
        val from = this
        val to = this.replace(text, "\nYoo bisa Yooo!")
        "Dari $from jadi $to"
    }
    println("$result")
}