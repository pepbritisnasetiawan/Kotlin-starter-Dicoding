/*
typealias Arithmetic = (Int, Int) -> Int

val sum: Arithmetic = { valueA, valueB -> valueA + valueB }

val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }

fun main() {
    val sumResult = sum.invoke(10, 10)
    val multiplyResult = multiply.invoke(20, 20)

    println(sumResult)
    println(multiplyResult)
}
 */
typealias Arithmetic = (Int, Int) -> Int
val sum: Arithmetic = { valueA, valueB -> valueA + valueB }
val multiply :Arithmetic = { valueA, valueB -> valueA * valueB }


fun main() {
    val sumResult = sum.invoke(50, 60)
    val multiplyResult = multiply.invoke(30, 50000)

    println(sumResult)
    println(multiplyResult)
}