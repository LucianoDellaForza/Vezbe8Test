package rs.raf.projekat1.covidapplication.vezbe8solo.data.entities

data class UserData (
    val id: Int,
    val name: String,
    val info: String
)

//ekstenzija UserData klase u vidu funkcije - za mapiranje iz UserData u User entity
fun UserData.toUser(): User {
    return User(name)
}