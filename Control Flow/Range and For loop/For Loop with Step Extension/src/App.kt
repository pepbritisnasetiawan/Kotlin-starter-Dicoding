/* main function
fun main() {
    val ranges = 1.rangeTo(10) step 3

    for (i in ranges ){
        println("value is $i!")
    }
}
 */
fun main() {
    val ranges = 1.rangeTo(100) step 5

    for (i in ranges) {
        println("value is $i!")
    }
}