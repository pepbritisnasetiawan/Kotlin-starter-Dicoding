import javax.xml.crypto.Data

/*class User(val name : String, val age : Int)

data class DataUser(val name : String, val age : Int)

fun main(){
    val user = User("nrohmen", 17)
    val dataUser = DataUser("nrohmen", 17)

    println(user)
    println(dataUser)
}

output ==>
User@57829d67
DataUser(name=Nrohmen, age=17)

 */
class User (val name : String, val age : Int)
data class DataUser(val name : String, val age: Int)

fun main() {
    val user = User("Nrohmen", 17)
    val dataUser = DataUser("Nrohmen", 17)

    println(user)
    println(dataUser)
}