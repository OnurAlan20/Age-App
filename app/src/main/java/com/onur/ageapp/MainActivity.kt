package com.onur.ageapp

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private var formatedMonth: String? = null
    private var formatedDay: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnDatePicker = findViewById<Button>(R.id.btn_date_picker)


        btnDatePicker.setOnClickListener {

            clickDatePicker()

        }

    }
    private fun clickDatePicker(){
        val myCalender = Calendar.getInstance()
        val year = myCalender.get(Calendar.YEAR)
        val month = myCalender.get(Calendar.MONTH)
        val day = myCalender.get(Calendar.DAY_OF_MONTH)
        val textViewCounter = findViewById<TextView>(R.id.textViewCounter)

        val textViewSelectedDate = findViewById<TextView>(R.id.textViewSelectedDate)

        val dpd = DatePickerDialog(
            this,
            { _, selectedYear , selectedMonth, selectedDay ->

                formattingDate(selectedMonth,selectedDay)
                val selectedDate = "$formatedDay/$formatedMonth/$selectedYear"
                textViewSelectedDate.text = selectedDate

                val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)
                val theDate = sdf.parse(selectedDate)
                val selectedDayInMinutes = theDate.time /60000

                val currentDate = sdf.parse(sdf.format(System.currentTimeMillis()))
                val currentDateInMınutes = currentDate.time/60000

                val diffirenceInMinutes= currentDateInMınutes - selectedDayInMinutes

                textViewCounter.text = diffirenceInMinutes.toString()

            },
            year,
            month,
            day
        )
        dpd.datePicker.maxDate = System.currentTimeMillis()
        dpd.show()
    }

    private fun formattingDate(selectedMonth: Int,selectedDay: Int){

        if (selectedMonth.toString().length < 2){
            formatedMonth = "0${selectedMonth+1}"
        }
        else{
            formatedMonth =(selectedMonth+1).toString()
        }
        if (selectedDay.toString().length < 2){
            formatedDay = "0$selectedDay"
        }
        else{
            formatedDay =selectedDay.toString()
        }
    }
    //todo








}