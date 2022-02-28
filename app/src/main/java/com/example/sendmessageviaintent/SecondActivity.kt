package com.example.sendmessageviaintent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val backButton = findViewById<Button>(R.id.btn_back)
        backButton.setOnClickListener {
            Intent(this, MainActivity::class.java).also {

                startActivity(it)
            }
        }
    }
}