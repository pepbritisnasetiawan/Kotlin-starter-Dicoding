/* main function
fun main() {
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)

    for (i in listOfInt) {
        if (i == null) break
        print(i)
    }
}
 */
fun main() {
    val listOfint = listOf(1, 2, 4, null, 7, null, 9)

    for (i in listOfint){
        if (i == null) break
        println(i)
    }
}