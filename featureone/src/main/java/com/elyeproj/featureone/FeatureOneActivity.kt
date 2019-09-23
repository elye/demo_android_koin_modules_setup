package com.elyeproj.featureone

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_feature_one.*
import org.koin.core.context.loadKoinModules
import org.koin.core.context.unloadKoinModules
import org.koin.java.KoinJavaComponent

class FeatureOneActivity : AppCompatActivity() {

    private val featureOneDependent by KoinJavaComponent.inject(FeatureOneDependent::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feature_one)
        loadKoinModules(featureOneKoinModule)
        txt_result.text = "I have get my dependents from\n$featureOneDependent\n"
    }

    override fun onDestroy() {
        super.onDestroy()
        unloadKoinModules(featureOneKoinModule)
    }
}
