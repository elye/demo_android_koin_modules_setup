package com.elyeproj.modular1bottombase

import org.koin.dsl.module

val mainKoinModule =
    module {
        single { (prefix: String, postfix: String) -> AppDependent("$prefix $postfix", get(), get()) }
    }
