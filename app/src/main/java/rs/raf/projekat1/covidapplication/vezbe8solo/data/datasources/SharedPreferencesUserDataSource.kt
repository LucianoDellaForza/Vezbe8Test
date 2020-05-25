package rs.raf.projekat1.covidapplication.vezbe8solo.data.datasources

import android.content.SharedPreferences
import rs.raf.projekat1.covidapplication.vezbe8solo.data.entities.UserData

class SharedPreferencesUserDataSource (
    private val sharedPreferences: SharedPreferences
): UserDataSource {

    companion object {
        const val USER_ID_KEY = "userId"
        const val USER_NAME_KEY = "userName"
        const val USER_INFO_KEY = "userInfo"
    }

    init {
        val editor = sharedPreferences.edit()
        editor.putInt(USER_ID_KEY, 111)
        editor.putString(USER_NAME_KEY, "Sharon")
        editor.putString(USER_INFO_KEY, "Neke informacije o Sharon")
        editor.apply()
    }

    override fun getUserData(): UserData {
        val id = sharedPreferences.getInt(USER_ID_KEY, 0)
        val name = sharedPreferences.getString(USER_NAME_KEY, "") ?: ""
        val info = sharedPreferences.getString(USER_INFO_KEY, "") ?: ""
        return UserData(id, name, info)
    }
}