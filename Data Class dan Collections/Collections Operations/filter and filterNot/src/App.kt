/* main function
fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val evenList = numberList.filter { it % 2 == 0 }
    val notEvenList = numberList.filterNot { it % 2 == 0 }

    println(evenList)
    println(notEvenList)
}
 */
fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val eventList = numberList.filter { it % 2 == 0 }
    val notEventList = numberList.filterNot { it % 2 == 0 }

    println(eventList)
    println(notEventList)
}