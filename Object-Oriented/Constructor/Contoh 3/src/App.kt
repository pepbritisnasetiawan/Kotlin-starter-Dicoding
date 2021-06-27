/*
class Animal(name: String, weight: Double, age: Int) {
    val name: String
    val weight: Double
    val age: Int
    var isMammal: Boolean

    init {
        this.weight = if (weight < 0) 0.1 else weight
        this.age = if (age < 0) 0 else age
        this.name = name
        this.isMammal = false
    }

    constructor(name: String, weight: Double, age: Int, isMammal: Boolean) : this(name, weight, age) {
        this.isMammal = isMammal
    }
}

fun main() {
    val dicodingCat = Animal("Dicoding Miaw", -6.0, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")

    val dicodingBird = Animal("Dicoding tweet", 0.5, 1)
    println("Nama: ${dicodingBird.name}, Berat: ${dicodingBird.weight}, Umur: ${dicodingBird.age}, mamalia: ${dicodingBird.isMammal}")
}
 */
class Animal(name: String, age: Int, weight: Double){
    val name: String
    val age: Int
    val weight: Double
    var isMammal: Boolean

    init {
        this.name = name
        this.age = if (age <= 0) 0 else age
        this.weight = if (weight <= 0) 0.1 else weight
        this.isMammal = false
    }
    constructor(name: String, age: Int, weight: Double, isMammal: Boolean) : this(name, age, weight){
        this.isMammal = isMammal
    }
}

fun main() {
    val dicodingCat = Animal("Dicoding Miaw", 3, 2.0, true)
    println("""
        Nama: ${dicodingCat.name},
        Berat: ${dicodingCat.weight},
        Umur: ${dicodingCat.age},
        Mamalia: ${dicodingCat.isMammal}
    """.trimIndent())
}