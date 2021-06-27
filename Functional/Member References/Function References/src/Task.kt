/*
fun main() {
    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(Int::isEvenNumber)

    println(evenNumbers)
}

fun Int.isEvenNumber() = this % 2 == 0
 */
fun main() {
    val numbers = 1.rangeTo(100)
    val evenNumbers = numbers.filter(Int::isEvenNumbers)

    println(evenNumbers)
}

fun Int.isEvenNumbers() = this % 2 == 0