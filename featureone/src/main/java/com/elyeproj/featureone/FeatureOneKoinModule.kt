package com.elyeproj.featureone

import org.koin.dsl.module

val featureOneKoinModule =
    module {
        single { FeatureOneDependent("From featureOneKoinModule FeatureOneDependent", get(), get()) }
    }
