/*
class Animal{
    var name: String = "Dicoding Miaw"
        get(){
            println("Fungsi Getter terpanggil")
            return field
        }
        set(value){
            println("Fungsi Setter terpanggil")
            field = value
        }
}

// main function
fun main(){
    val dicodingCat = Animal()
    println("Nama: ${dicodingCat.name}" )
    dicodingCat.name = "Goose"
    println("Nama: ${dicodingCat.name}")
}
 */
class Animal{
    var name: String = "Dicoding Miaw"
    get() {
        println("Fungsi Getter terpanggil")
        return field
    }
    set(value) {
        println("Fungsin Setter terpanggil")
        field = value
    }
}

fun main() {
    val dicodingCat = Animal()
    println("Nama: ${dicodingCat.name}")
    dicodingCat.name = "Goose"
    println("Nama: ${dicodingCat.name}")
}