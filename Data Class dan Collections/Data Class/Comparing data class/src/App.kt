/* data class memiliki fungsi equal dan juga toString
data class DataUser(val name : String, val age : Int)

fun main(){
    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)

    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))

}
 */

data class DataUser (val name: String, val age : Int)

fun main() {
    val dataUser = DataUser("Kinnay", 23)
    val dataUser2 = DataUser("Reva", 17)
    val dataUser3 = DataUser("Damas", 23)

    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))
}