package rs.raf.projekat1.covidapplication.vezbe8solo.presentation.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_user.*
import org.koin.androidx.viewmodel.ext.android.viewModel
import rs.raf.projekat1.covidapplication.vezbe8solo.R
import rs.raf.projekat1.covidapplication.vezbe8solo.presentation.contracts.UserContract
import rs.raf.projekat1.covidapplication.vezbe8solo.presentation.viewmodels.UserViewModel

class UserActivity : AppCompatActivity(R.layout.activity_user) {

    private val userViewModel: UserContract.ViewModel by viewModel<UserViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    private fun init() {
        initObservers()
    }

    private fun initObservers() {
        userViewModel.user.observe(this, Observer {
            userTv.text = it.name
        })
        userViewModel.getUser()
    }
}
