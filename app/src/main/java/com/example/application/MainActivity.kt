package com.example.application

import android.content.Intent
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import com.example.application.databinding.ActivityMainBinding
import com.example.lists.DetailsActivity

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emriEditText = findViewById<EditText>(R.id.NameEditText)
        val MbiemtiEditText = findViewById<EditText>(R.id.SurnameEditText)
        val TeleditText = findViewById<EditText>(R.id.TelEditText)
        val DateEditText = findViewById<EditText>(R.id.DateEditText)
        val EmailEditText = findViewById<EditText>(R.id.EmailEditText)


        val register = findViewById<Button>(R.id.Button_Register)

        register.setOnClickListener{
            val intent = Intent(this, DetailsActivity::class.java)

            intent.putExtra("emri", emriEditText.text.toString())
            intent.putExtra("mbiemri", MbiemtiEditText.text.toString())
            intent.putExtra("tel", TeleditText.text.toString())
            intent.putExtra("Date", DateEditText.text.toString())
            intent.putExtra("email", EmailEditText.text.toString())
            startActivity(intent)
        }

    }
}