import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

/*
import kotlinx.coroutines.*

suspend fun getCapital(): Int {
    delay(1000L)
    return 50000
}

suspend fun getIncome(): Int {
    delay(1000L)
    return 75000
}

fun main() = runBlocking {
    val capital = getCapital()
    val income = getIncome()
    println("Your profit is ${income - capital}")
}

 */
suspend fun getCapital(): Int {
    delay(1000L)
    return 50000
}

suspend fun getIncome(): Int {
    delay(1000L)
    return 75000
}

fun main() = runBlocking {
    val income = getIncome()
    val capital = getCapital()
    println("Your profit is ${income - capital}")
}
