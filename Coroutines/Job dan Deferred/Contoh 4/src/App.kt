/*
import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        delay(5000)
        println("Start new job!")
    }

    delay(2000)
    job.cancel()
    println("Cancelling job...")
    if (job.isCancelled){
        println("Job is cancelled")
    }
}
 */
import kotlinx.coroutines.*

fun main() = runBlocking{
    val job = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Start new job!")
    }

    job.cancel()
    println("Cancelling job...")
    if (job.isCancelled){
        println("job is cancelled")
    }
}
// kode di atas menggambarkan sebuah job yang membutuhkan waktu 5detik untuk dijalankan
// akan tetapi di detik ke 2 job tersebut di batalkan