/*
fun main() {
    val list = (1..1_000_000).toList()
    list.asSequence().filter { it % 5 == 0 }.map { it + it }.forEach { println(it) }
}
 */
fun main() {
    val list = (1..1_000_000).toList()
    list.asSequence().filter { it % 3 == 0 }.map { it + it }.forEach { println(it) }
}