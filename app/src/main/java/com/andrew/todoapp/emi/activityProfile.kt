package com.andrew.todoapp.emi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class activityProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile2)
        homeButton = findViewById(R.id.homeButton)

    }
}