/* main function
fun main() {
    val officeOpen = 7
    val now = 7
    val office: String
    office = if (now > 7) {
        "Office already open"
    } else if (now == officeOpen){
        "Wait a minute, office will be open"
    } else {
        "Office is closed"
    }

    print(office)
}

 */

fun main() {
    val officeOpen = 7
    val now = 7
    val office: String = if (now > officeOpen) {
        "Office already open"
    } else if (now == officeOpen) {
        "Wait a minute, akan segera buka"
    } else {
        "Office udah tutup"
    }

    println(office)
}