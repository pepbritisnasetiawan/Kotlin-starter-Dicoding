import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

/*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    launch {
        // TODO: Implement suspending lambda here
    }

    launch(Dispatchers.Default) {
        // TODO: Implement suspending lambda here
    }

    println("Dispatcher Default")
}
 */
fun main() = runBlocking {
    launch {
        // Todo implement suspending lamda
        // ini merupakan dispatcher dasar yang digunakan oleh semua standard builder jika tidak ada dispatcher lain yang di tentukan
    }

    launch(Dispatchers.Default) {
        // ini cara penulisan yang eksplisit
    }

    println("Dispatcher Default")
}