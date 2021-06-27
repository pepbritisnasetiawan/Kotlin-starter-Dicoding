/*
fun main() {
    val total = listOf(1, 2, 3, 4, 5, 6)
    val take = total.takeLast(3)

    println(take)
}
 */
fun main() {
    val numbers = listOf(1, 3, 4, 5, 6, 7, 8)
    val take = numbers.take(2) // sama seperti drop bisa juga untuk menyaring item di list
    val takeLast = numbers.takeLast(3) //ini ambil dari belakang

    println("hasil take = $take")
    println("hasil take last = $takeLast")
}