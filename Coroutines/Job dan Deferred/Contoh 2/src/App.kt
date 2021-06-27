/*
import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Start new job!")
    }

    job.start()
    println("Other task")
}

star = CoroutineStart.LAZY digunakan untuk menunda sebuah job untuk langsung di jalankan
job.start() digunakan untuk menjalankan job tanpa menunggu job tersebut selesai
 */

import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Start new job!")
    }
    job.start()
    println("Other task")
}