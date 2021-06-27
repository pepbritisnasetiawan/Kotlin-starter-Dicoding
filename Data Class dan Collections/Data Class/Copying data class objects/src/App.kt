/* data class DataUser(val name : String, val age : Int)

fun main(){
    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)
    val dataUser4 = dataUser.copy()

    println(dataUser4)
}
 */
data class DataUser(val name:String, val age : Int)

fun main() {
    val dataUser = DataUser("Kinnay", 20)
    val dataUser2 = DataUser("Kinnay", 20)
    val dataUser3 = DataUser("Damas", 23)
    val dataUser4 = dataUser.copy()
    val dataUser5 = dataUser2.copy(age = 24)

    println(dataUser4)
    println(dataUser5)
}