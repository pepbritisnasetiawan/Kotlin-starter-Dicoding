import kotlinx.coroutines.*
/*
suspend fun getCapital(): Int {
    delay(1000L)
    return 50000
}

suspend fun getIncome(): Int {
    delay(1000L)
    return 75000
}

fun main() = runBlocking {
    val capital = async { getCapital() }
    val income = async { getIncome() }
    println("Your profit is ${income.await() - capital.await()}")
}
 */
suspend fun getCapital(): Int {
    delay(1000L)
    return 900000
}

suspend fun getIncome(): Int {
    delay(1000L)
    return 7500000
}

fun main() = runBlocking {
    val capital = async { getCapital() }
    val income = async { getIncome() }
    println("Your profit is ${income.await() - capital.await()}")
}
/*
fungsi async di gunakan saat tidak ada hubungan antara dua fungsi
dan ingin menjalankan 2 fungsi tersebut secara bersamaan.
fungsi async akan mengembalikan hasil dari masing masing fungsi.
await() digunakan untuk mengakses hasilnya
 */