package rs.raf.projekat1.covidapplication.vezbe8solo.modules

import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import rs.raf.projekat1.covidapplication.vezbe8solo.data.datasources.JsonUserDataSource
import rs.raf.projekat1.covidapplication.vezbe8solo.data.datasources.SharedPreferencesUserDataSource
import rs.raf.projekat1.covidapplication.vezbe8solo.data.datasources.UserDataSource
import rs.raf.projekat1.covidapplication.vezbe8solo.data.repositories.UserRepository
import rs.raf.projekat1.covidapplication.vezbe8solo.data.repositories.UserRepositoryImpl
import rs.raf.projekat1.covidapplication.vezbe8solo.presentation.viewmodels.UserViewModel

val userModule = module {

    viewModel { UserViewModel(userRepository = get()) }

    single<UserRepository> { UserRepositoryImpl(userDataSource = get(named("json")))}

    single<UserDataSource>(named("shared")) { SharedPreferencesUserDataSource(sharedPreferences = get())}

    single<UserDataSource>(named("json")) { JsonUserDataSource(context = androidApplication(), moshi = get())}
}