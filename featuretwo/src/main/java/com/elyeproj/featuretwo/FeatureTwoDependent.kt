package com.elyeproj.featuretwo

import com.elyeproj.base.BaseNetwork
import com.elyeproj.base.BaseRepository

class FeatureTwoDependent(val name: String, private val baseRepository: BaseRepository, private val baseNetwork: BaseNetwork) {
    override fun toString(): String {
        return "FeatureTwoDependent $name ${super.toString()} with\n$baseRepository and\n$baseNetwork"
    }
}
