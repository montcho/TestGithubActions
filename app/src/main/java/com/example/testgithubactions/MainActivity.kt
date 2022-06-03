package com.example.testgithubactions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtConfig = findViewById<TextView>(R.id.txtConfig)

        val configText = """
            VERSION CODE :  ${BuildConfig.VERSION_CODE}
            NAME :  ${BuildConfig.VERSION_NAME}
            DESC :  ${BuildConfig.DESC}
        """.trimIndent()

        txtConfig.text = configText
    }
}