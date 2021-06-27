/* main function
fun main() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    // val isOpen = now in officeOpen..officeClosed
    val isOpen = now >= officeOpen && now <= officeClosed

    print("Office is open : $isOpen")
}

 */

fun main() {
    val officeOpen = 7
    val now = 20
    val officeClosed = 16

    val isOpen = now in (officeOpen + 1)..officeClosed

    println("Office is open: $isOpen")
}