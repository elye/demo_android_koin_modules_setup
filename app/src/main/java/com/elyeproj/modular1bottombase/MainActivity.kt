package com.elyeproj.modular1bottombase

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.elyeproj.featureone.FeatureOneActivity
import com.elyeproj.featuretwo.FeatureTwoActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject
import org.koin.core.context.loadKoinModules
import org.koin.core.context.unloadKoinModules
import org.koin.core.parameter.parametersOf

class MainActivity : AppCompatActivity() {

    private val appDependent by inject<AppDependent> { parametersOf("first", "second") }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadKoinModules(mainKoinModule)

        txt_result.text = "I have get my dependents from\n$appDependent"

        button_one.setOnClickListener {
            startActivity(Intent(this, FeatureOneActivity::class.java))
        }

        button_two.setOnClickListener {
            startActivity(Intent(this, FeatureTwoActivity::class.java))
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        unloadKoinModules(mainKoinModule)
    }
}
