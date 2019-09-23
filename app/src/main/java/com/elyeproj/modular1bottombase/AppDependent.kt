package com.elyeproj.modular1bottombase

import com.elyeproj.base.BaseNetwork
import com.elyeproj.base.BaseRepository

class AppDependent(val name: String, private val baseRepository: BaseRepository, private val baseNetwork: BaseNetwork) {
    override fun toString(): String {
        return "AppDependent $name ${super.toString()} with\n$baseRepository and\n$baseNetwork"
    }
}
