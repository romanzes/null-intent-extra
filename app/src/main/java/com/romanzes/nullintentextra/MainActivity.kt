package com.romanzes.nullintentextra

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            val formData = FormData(editText.text.toString())
            startActivity(
                    Intent(this, SecondActivity::class.java)
                            .also { it.putExtra(EXTRA_TEXT, formData) }
            )
        }
    }
}
