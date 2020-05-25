package rs.raf.projekat1.covidapplication.vezbe8solo.presentation.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import rs.raf.projekat1.covidapplication.vezbe8solo.data.entities.User
import rs.raf.projekat1.covidapplication.vezbe8solo.data.repositories.UserRepository
import rs.raf.projekat1.covidapplication.vezbe8solo.presentation.contracts.UserContract

class UserViewModel (private val userRepository: UserRepository) : ViewModel(),  UserContract.ViewModel {

    override val user: MutableLiveData<User> = MutableLiveData()

    override fun getUser() {
        user.value = userRepository.getUser()
    }
}