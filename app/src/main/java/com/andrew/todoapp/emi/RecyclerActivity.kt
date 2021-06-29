package com.andrew.todoapp.emi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.andrew.todoapp.databinding.ActivityRecyclerBinding

class RecyclerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRecyclerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}