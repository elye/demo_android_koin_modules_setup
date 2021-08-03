package com.elyeproj.featuretwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_feature_two.*
import org.koin.android.ext.android.inject
import org.koin.core.context.loadKoinModules
import org.koin.core.context.unloadKoinModules

class FeatureTwoActivity : AppCompatActivity() {

    private val featureTwoDependent by inject<FeatureTwoDependent>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_two)

        loadKoinModules(featureTwoKoinModule)

        txt_result.text = "I have get my dependents from\n$featureTwoDependent"
    }

    override fun onDestroy() {
        super.onDestroy()
        unloadKoinModules(featureTwoKoinModule)
    }
}
