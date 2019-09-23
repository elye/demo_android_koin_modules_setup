package com.elyeproj.base

import org.koin.dsl.module

val baseNetworkKoinModule =
    module {
        single { BaseNetwork("From baseNetworkKoinModule BaseNetwork") }
    }
