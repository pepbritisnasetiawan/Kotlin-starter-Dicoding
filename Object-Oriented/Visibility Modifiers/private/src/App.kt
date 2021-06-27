/*
class Animal(private var name: String, private val weight: Double, private val age: Int, private val isMammal: Boolean = true) {


    fun getName() = name

    fun setName(newName: String) {
        name = newName
    }
}

fun main() {
    val dicodingCat = Animal("Dicoding Miaw", 2.5, 2)

    // dicoding.name <- Cannot access '[PROPERTY]': it is private in 'Animal'
    println(dicodingCat.getName())
    dicodingCat.setName("Gooose")
    println(dicodingCat.getName())
}
 */
class Animal(private var name: String,
             private val weight: Double,
             private val age: Int,
             private val isMammal: Boolean){

    fun getName(): String {
        return name
    }

    fun setName(newName: String) {
        name = newName
    }
}

fun main() {
    val dicodingCat = Animal("Kucing Oren", 2.0, 2, true)
    //println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, Mamalia: ${dicodingCat.isMammal})
    //ini akan muncul error Cannot access '[PROPERTY]': it is private in 'Animal'.
    // karena hak akses privat kita tidak di ijinkan mengakses diluar kelas Animal
    // getter dan setter dibutuhkan untuk mengaksesnya

    //setelah menggunakan getter setter
    println(dicodingCat.getName())
    dicodingCat.setName("Oren")
    println(dicodingCat.getName())
}