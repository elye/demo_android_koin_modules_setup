package com.elyeproj.modular1bottombase

import org.koin.dsl.module

val mainKoinModule =
    module {
        single { (message: String) -> AppDependent(message, get(), get()) }
    }
