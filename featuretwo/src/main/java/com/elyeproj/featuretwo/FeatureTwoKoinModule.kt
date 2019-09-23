package com.elyeproj.featuretwo

import org.koin.dsl.module

val featureTwoKoinModule =
    module {
        single { FeatureTwoDependent("From featureTwoKoinModule FeatureTwoDependent", get(), get()) }
    }
