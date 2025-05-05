package com.tm.shopper

import android.app.Application
import com.tm.data.di.dataModule
import com.tm.domain.di.domainModule
import com.tm.shopper.di.presentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class ShopperApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@ShopperApplication)
            modules(listOf(
                presentationModule,
                dataModule,
                domainModule
            ))
        }
    }
}