package com.elyeproj.featuretwo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_feature_two.*
import org.koin.core.context.loadKoinModules
import org.koin.core.context.unloadKoinModules
import org.koin.java.KoinJavaComponent

class FeatureTwoActivity : AppCompatActivity() {

    private val featureTwoDependent by KoinJavaComponent.inject(FeatureTwoDependent::class.java)

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
