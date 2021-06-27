/*
class Animal(pName: String, pWeight: Double, pAge: Int, pIsMammal: Boolean){
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    init {
        weight = if(pWeight <= 0) 0.1 else pWeight
        age = if(pAge <= 0) 0 else pAge
        name = pName
        isMammal = pIsMammal
    }
}

fun main() {
    val dicodingCat = Animal("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
}
 */
class Animal(pName: String, pWeight: Double, pAge: Int, pIsMammal: Boolean){
    val name: String
    val wight: Double
    val age: Int
    val isMammal: Boolean

    init {
        wight = if (pWeight <= 0) 0.1 else pWeight
        age = if (pAge <= 0) 0 else pAge
        name = pName
        isMammal = pIsMammal
    }
}

fun main() {
    val dicodingCat = Animal("Dicoding Miaw", 4.5, 4, true)
    println("""
        Name: ${dicodingCat.name},
        Berat: ${dicodingCat.wight},
        Umur: ${dicodingCat.age},
        Mamalia: ${dicodingCat.isMammal}
    """.trimIndent())
}