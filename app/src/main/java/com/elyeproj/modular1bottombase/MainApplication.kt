package com.elyeproj.modular1bottombase

import android.app.Application
import com.elyeproj.base.baseNetworkKoinModule
import com.elyeproj.base.baseRepositoryKoinModule
import org.koin.core.context.startKoin

class MainApplication: Application() {
    override fun onCreate(){
        super.onCreate()
        startKoin {
            // declare modules
            modules(listOf(baseNetworkKoinModule, baseRepositoryKoinModule))
        }
    }
}
