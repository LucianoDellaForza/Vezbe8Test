package rs.raf.projekat1.covidapplication.vezbe8solo.data.datasources

import rs.raf.projekat1.covidapplication.vezbe8solo.data.entities.UserData

interface UserDataSource {
    fun getUserData(): UserData
}