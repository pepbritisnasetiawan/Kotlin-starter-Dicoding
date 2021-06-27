/*
fun main() {
    val numbers = listOf(1, 2, 3)
    val fold = numbers.foldRight(10) { item, current ->
        println("current $current")
        println("item $item")
        println()
        item + current
    }

    println("Fold result: $fold")
}
 */
fun main() {
    val number = listOf(1, 2, 4)
    val fold = number.foldRight(12) { item, current->
        println("current $current")
        println("item $item")
        println()
        item + current
    }

    println("Fold result = $fold")
}