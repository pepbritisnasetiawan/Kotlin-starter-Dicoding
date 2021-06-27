class Animal{
    val name: String? = readLine()
    val weight: Double? = readLine()?.toDouble()
    val age: Int? = readLine()?.toInt()
    val isMammal: Boolean = true
}

fun main(){
    val dicodingCat = Animal()
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
}