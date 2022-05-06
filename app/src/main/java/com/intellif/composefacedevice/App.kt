package com.intellif.composefacedevice

import android.app.Application
import com.tencent.mmkv.MMKV

//import org.koin.android.ext.koin.androidContext
//import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        MMKV.initialize(this)
//        startKoin {
//            // Android context
//            androidContext(this@App)
//            // modules
//            modules(appModule)
//        }
    }
}