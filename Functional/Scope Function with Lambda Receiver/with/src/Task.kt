/*
fun main() {
    val message = "Hello Kotlin!"
    val result = with(message) {
        "First character is ${this[0]}" +
                " and last character is ${this[this.length - 1]}"
    }

    println(result)
}
 */
fun main() {
    val pesan = "Jangan males!"
    val hasil = with(pesan) {
        "First character is ${this[0]}" +
                " and last character is ${this[this.length - 1]}"
    }

    println(hasil)
}