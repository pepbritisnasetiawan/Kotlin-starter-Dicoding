/*
fun main() {
    val number = listOf(1, 2, 3, 4, 5, 6)
    val drop = number.dropLast(3)

    println(drop)
}
 */
fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val drop = numbers.drop(4) // memangkas 4 angka dari awal
    val dropLast = numbers.dropLast(2) // memangkas 2 angka dari akhir

    println("hasil drop = $drop")
    println("hasil dropLast = $dropLast")
}