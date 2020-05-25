package rs.raf.projekat1.covidapplication.vezbe8solo.data.repositories

import rs.raf.projekat1.covidapplication.vezbe8solo.data.entities.User

interface UserRepository {
    fun getUser(): User
}