package com.example.lists

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.application.R
import kotlinx.coroutines.selects.SelectInstance

class DetailsActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val emriEditText = findViewById<TextView>(R.id.Name_show)
        val MbiemtiEditText = findViewById<TextView>(R.id.Surname_show)
        val TeleditText = findViewById<TextView>(R.id.Tel_show)
        val DateEditText = findViewById<TextView>(R.id.Date_Show)
        val Emailtext = findViewById<TextView>(R.id.Email_Show)


        val emri = intent.extras?.getString("emri")
        val mbiemri = intent.extras?.getString("mbiemri")
        val tel = intent.extras?.getString("tel")
        val date = intent.extras?.getString("Date")
        val email = intent.extras?.getString("email")
        emriEditText.text = "$emri"
        MbiemtiEditText.text = "$mbiemri"
        TeleditText.text = "$tel"
        DateEditText.text = "$date"
        Emailtext.text = "$email"


    }
}