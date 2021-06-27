/*
class Animal(val name: String,
             val weight: Double,
             val age: Int,
             val isMammal: Boolean) {

    fun eat() {
        println("$name makan!")
    }

    fun sleep() {
        println("$name tidur!")
    }
}

// main function
fun main() {
    val dicodingCat = Animal("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
    dicodingCat.eat()
    dicodingCat.sleep()
}
 */
class Animal(val name: String,
val wight: Double,
val age: Int,
val isMamal: Boolean) {

    fun eat(){
        println("$name makan!")
    }

    fun  sleep() {
        println("$name tidur!")
    }
}

fun main() {
    val dicodingCat = Animal("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.wight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMamal}")
    dicodingCat.eat()
    dicodingCat.sleep()
}