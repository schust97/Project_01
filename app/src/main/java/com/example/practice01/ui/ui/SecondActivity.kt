package com.example.practice01.ui.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.practice01.R

class SecondActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        if (intent !=null) {
            val userName = intent.extras?.get("UserName")
            Toast.makeText(this, "your name is $userName", Toast.LENGTH_SHORT).show()
        }
    }
}