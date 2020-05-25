package rs.raf.projekat1.covidapplication.vezbe8solo.presentation.contracts

import androidx.lifecycle.LiveData
import rs.raf.projekat1.covidapplication.vezbe8solo.data.entities.User

interface UserContract {

    interface ViewModel {
        val user: LiveData<User>

        fun getUser()
    }
}