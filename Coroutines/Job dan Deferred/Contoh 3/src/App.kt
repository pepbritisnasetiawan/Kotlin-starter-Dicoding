/*
import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Start new job!")
    }

    job.join()
    println("Other task")
}
 */
import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Start new job!")
    }

    job.join()
    println("Other task")
}
/*
start = CoroutineStart.LAZY digunakan untuk menunda job untuk langsung dijalankan
job.join() fungsi untuk menjalankan job dengan menunda eksekusi sampai job selesai
 */