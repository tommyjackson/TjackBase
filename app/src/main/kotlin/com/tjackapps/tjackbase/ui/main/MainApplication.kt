package com.tjackapps.tjackbase.ui.main

import android.app.Application
import com.tjackapps.tjackbase.BuildConfig
import dagger.hilt.android.HiltAndroidApp
//import timber.log.Timber




@HiltAndroidApp
class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()

//        if (BuildConfig.DEBUG) {
//            Timber.plant(DebugTree())
//        }
    }

}