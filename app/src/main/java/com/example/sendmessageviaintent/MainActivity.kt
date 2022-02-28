package com.example.sendmessageviaintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val forwardBtn = findViewById<Button>(R.id.btn_open_activity)
        forwardBtn.setOnClickListener{

            Intent(this, SecondActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}