import java.lang.NullPointerException
import java.lang.NumberFormatException

/*
import kotlin.NumberFormatException

// main function
fun main() {
    val someStringValue: String? = null
    var someIntValue = 0

    try {
        someIntValue = someStringValue!!.toInt()
    } catch (e: NullPointerException) {
        someIntValue = 0
    } catch (e: NumberFormatException) {
        someIntValue = -1
    } finally {
        when (someIntValue) {
            0 -> println("Catch block NullPointerException terpanggil!")
            -1 -> println("Catch block NumberFormatException terpanggil!")
            else -> println(someIntValue)
        }
    }
}
 */
fun main() {
    val someStringValue: String? = null
    var someIntValue = 0

    try {
        someIntValue = someStringValue!!.toInt()
    } catch (e: NullPointerException) {
        someIntValue = -1
    } catch (e: NumberFormatException) {
        someIntValue = -1
    } finally {
        when (someIntValue) {
            0 -> println("Catch blok NullPointerExeception terpanggil!")
            -1 -> println("Catch blok NumberFormatExection terpanggil!")
            else -> println(someIntValue)
        }
    }
}