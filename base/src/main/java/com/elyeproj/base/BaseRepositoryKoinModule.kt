package com.elyeproj.base

import org.koin.dsl.module

val baseRepositoryKoinModule =
    module {
        single { BaseRepository("From baseRepositoryKoinModule BaseRepository") }
    }
