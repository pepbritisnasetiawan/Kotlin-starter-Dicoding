val Int?.slice: Int?
    get() = this?.div(2) ?:0

/*
main function
fun main() {
    val value: Int? = null

    println(value.slice)
}

val Int?.slice: Int
    get() = this?.div(2) ?: 0
 */
fun main() {
    val value : Int? = null

    println(value.slice)
}