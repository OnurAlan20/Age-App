package com.onur.ageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView1 = findViewById<TextView>(R.id.textview1)
        val btnClickMe = findViewById<Button>(R.id.btnclick1)
        val textCounter = findViewById<TextView>(R.id.counter)
        var countValue = 0


        btnClickMe.setOnClickListener {
            textView1.text = " You Click Me Bro!"
            textView1.text = " You Click Me Bro!231"
            countValue+=1
            textCounter.text = countValue.toString()
        }



    }
}