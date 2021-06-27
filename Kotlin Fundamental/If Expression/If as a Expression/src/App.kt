/* main function
fun main() {
    val officeOpen = 7
    val now = 20
    val office: String
    office = if (now > officeOpen) {
        "Office already open"
    } else {
        "Office is closed"
    }

    print(office)
}

 */

fun main() {
    val officeOpen = 8
    val now = 20
    val office: String = if (now > officeOpen) {
        "Office already open"
    }else {
        "Office Tutup"
    }

    println(office)
}