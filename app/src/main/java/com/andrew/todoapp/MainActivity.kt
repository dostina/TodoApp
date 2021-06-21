package com.andrew.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    var username: String = "admin"
    var password: String = "admin"
    private lateinit var UserNameInput:EditText
    private lateinit var PassWordInput:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}v