package rs.raf.projekat1.covidapplication.vezbe8solo.application

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidFileProperties
import org.koin.android.ext.koin.androidLogger
import org.koin.androidx.fragment.koin.fragmentFactory
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import rs.raf.projekat1.covidapplication.vezbe8solo.modules.coreModule
import rs.raf.projekat1.covidapplication.vezbe8solo.modules.userModule
import timber.log.Timber

class SetupApplication  : Application() {

    override fun onCreate() {
        super.onCreate()
        init()
    }

    private fun init() {
        initTimber()
        initKoin()
    }

    private fun initTimber() {
        Timber.plant(Timber.DebugTree())
    }

    private fun initKoin() {
        //moze da postoji samo jedan modul, a moze da se podeli logika na vise modula
        //modul je obican kotlin fajl
        //ovo je nacin kako se definisu stvari koje su mi potrebne za dependency injection
        val modules = listOf(
            coreModule,
            userModule
//            rxUserModule,
//            threadingModule
        )
        startKoin {
            androidLogger(Level.DEBUG)
            // Use application context
            androidContext(this@SetupApplication)
            // Use properties from assets/koin.properties
            androidFileProperties()
            // Use koin fragment factory for fragment instantiation
            fragmentFactory()
            // modules
            modules(modules)
        }
    }

}