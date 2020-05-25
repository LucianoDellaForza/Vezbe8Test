package rs.raf.projekat1.covidapplication.vezbe8solo.data.datasources

import android.content.Context
import com.squareup.moshi.Moshi
import rs.raf.projekat1.covidapplication.vezbe8solo.data.entities.UserData
import java.io.IOException

class JsonUserDataSource(
    private val context: Context,
    private val moshi: Moshi
): UserDataSource {

    override fun getUserData(): UserData {
        val userJson = getJsonDataFromAsset()
        val jsonAdapter = moshi.adapter(UserData::class.java)
        val userData: UserData = jsonAdapter.fromJson(userJson)!!
        return userData
    }

    private fun getJsonDataFromAsset(): String? {
        val jsonString: String
        try {
            jsonString = context.assets.open("user.json").bufferedReader().use { it.readText() }
        } catch (ioException: IOException) {
            ioException.printStackTrace()
            return null
        }
        return jsonString
    }

}