/* main function
fun main() {
    val tenToOne = 10.downTo(1)
    if (7 in tenToOne) {
        println("Value 7 available")
    }
}
 */
fun main() {
    val tenToOne = 10.downTo(1)
    if (11 in tenToOne) {
        println("Value 7 available")
    }else {
        print("Undefined!")
    }
}