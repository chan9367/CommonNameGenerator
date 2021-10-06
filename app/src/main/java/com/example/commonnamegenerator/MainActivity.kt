package com.example.commonnamegenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val generateNameButton = findViewById<Button>(R.id.GenerateNameButton)
        val firstNameTextView = findViewById<TextView>(R.id.FirstNameTextView)
        val lastNameTextView = findViewById<TextView>(R.id.LastNameTextView)

        val firstNameArr = arrayOf<String>("Jessica", "Brittany", "Samantha", "Michael", "Daniel", "Justin", "Melissa", "Heather", "John", "Jason")
        val lastNameArr = arrayOf<String>("Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "Garcia", "Rodriguez", "Wilson")

        generateNameButton.setOnClickListener {
            val randomFirstNameIndex = Random().nextInt(firstNameArr.size)
            val randomLastNameIndex = Random().nextInt(lastNameArr.size)

            firstNameTextView.text = firstNameArr[randomFirstNameIndex]
            lastNameTextView.text = lastNameArr[randomLastNameIndex]
        }
    }
}