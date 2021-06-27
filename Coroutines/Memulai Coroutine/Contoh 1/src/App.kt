import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking{
    launch {
        delay(1000L)
        println("Coroutines!")
    }
    println("Hello,")
    delay(2000L)
}
 */

fun main() = runBlocking {
    launch {
        delay(1000L) //menunda kode berikutnya selama 1 detik
        println("febriii!")
        // "febrii!" keluarnya delay 1 detik jadi kode setelahnya duluan baru ini keluar
    }
    println("Hello,")
    delay(2000L) // delay 2 detik untuk menghentikan JVM
}