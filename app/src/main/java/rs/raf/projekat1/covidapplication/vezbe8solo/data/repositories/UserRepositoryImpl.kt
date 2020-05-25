package rs.raf.projekat1.covidapplication.vezbe8solo.data.repositories

import rs.raf.projekat1.covidapplication.vezbe8solo.data.datasources.UserDataSource
import rs.raf.projekat1.covidapplication.vezbe8solo.data.entities.User
import rs.raf.projekat1.covidapplication.vezbe8solo.data.entities.toUser

class UserRepositoryImpl (private val userDataSource: UserDataSource) : UserRepository {

    override fun getUser(): User {
        return userDataSource.getUserData().toUser()
    }
}