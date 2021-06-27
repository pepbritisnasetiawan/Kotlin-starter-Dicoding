/*
fun main() {
    val capital = mapOf(
            "Jakarta" to "Indonesia",
            "London" to "England",
            "New Delhi" to "India"
    )

    println(capital["Jakarta"])
    println(capital.getValue("Jakarta"))

    val mapKeys = capital.keys
    val mapValues = capital.values

    println(mapKeys)
    println(mapValues)
}
 */
fun main() {
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "Tokyo" to "Japan"
    )

    println(capital["Tokyo"])
    println(capital.getValue("Jakarta"))

    val mapKeys = capital.keys
    val mapValues = capital.values

    println(mapKeys)
    println(mapValues)

    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Seoul", "Korea Selatan")
    mutableCapital.put("Berlin", "Dutch")
    println(mutableCapital)
}
