package com.onur.ageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClickMe = findViewById<Button>(R.id.btnclick1)
        btnClickMe.setOnClickListener {

        }
        val textView1 = findViewById<TextView>(R.id.textview1)
        textView1.setOnClickListener {
            textView1.text = " You Click Me Bro!"
        }
    }
}