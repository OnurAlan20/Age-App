package com.onur.ageapp

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import android.widget.Toast
import java.time.DayOfWeek
import java.time.Month
import java.time.Year
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDatePicker = findViewById<Button>(R.id.btn_date_picker)

        //when you click button the code which in the setOnClickListener will work.
        btnDatePicker.setOnClickListener {
            clickDatePicker()

        }



    }

    //This is How Can you do a date picker dialog.
    fun clickDatePicker(){

        val myCalendar = Calendar.getInstance()
        val year = myCalendar.get(Calendar.YEAR)
        val month = myCalendar.get(Calendar.MONTH)
        val day = myCalendar.get(Calendar.DAY_OF_MONTH)

        DatePickerDialog(this,
            DatePickerDialog.OnDateSetListener{
                view, year, month, dayOfMonth ->
                Toast.makeText(this,"Date Picker Dialog works well!",Toast.LENGTH_LONG).show()
            },
            year,
            month,
            day

        ).show()

    }
}