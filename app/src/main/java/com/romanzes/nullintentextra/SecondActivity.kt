package com.romanzes.nullintentextra

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

const val EXTRA_TEXT = "enteredText"

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val text = intent.getStringExtra(EXTRA_TEXT)
        textResult.text = getString(R.string.text_result, text)
    }
}
