package rs.raf.projekat1.covidapplication.vezbe8solo.presentation.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import rs.raf.projekat1.covidapplication.vezbe8solo.R

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    private fun init() {
        initUi()
    }

    private fun initUi() {
        repositoryBtn.setOnClickListener {
            val intent = Intent(this, UserActivity::class.java)
            startActivity(intent)
        }
//        threadingBtn.setOnClickListener {
//            val intent = Intent(this, ThreadingActivity::class.java)
//            startActivity(intent)
//        }
//        rxRepositoryBtn.setOnClickListener {
//            val intent = Intent(this, RxUserActivity::class.java)
//            startActivity(intent)
//        }
    }
}
