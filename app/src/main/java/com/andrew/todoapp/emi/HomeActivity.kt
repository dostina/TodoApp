package com.andrew.todoapp.emi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.andrew.todoapp.R

class HomeActivity : AppCompatActivity() {

    private lateinit var usernameDisplay: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        usernameDisplay = findViewById(R.id.usernameDisplay)
        usernameDisplay.text= intent.getStringExtra("username")
    }
}