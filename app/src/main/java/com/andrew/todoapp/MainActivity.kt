package com.andrew.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var Validusername: String = "admin"
    var Valiidpassword: String = "admin"
    private lateinit var UserNameInput: EditText
    private lateinit var PassWordInput: EditText
    private lateinit var SummitButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        UserNameInput = findViewById(R.id.UserNameInput)
        PassWordInput = findViewById(R.id.PassWordInput)
        SummitButton = findViewById(R.id.SummitButton)

        SummitButton.setOnClickListener {
            val username = UserNameInput.text.toString()
            val password = PassWordInput.text.toString()
            login(username, password)
        }
    }

    fun login(userName: String, Password: String) {
        if (isValidCredentials(userName, Password)) {
            val Intent: Intent = Intent(this, HomeActivity::class.java)
            intent.putExtra("userName", userName)
            startActivity(intent)

        } else {
            Toast.makeText(applicationContext,"login unsuccessful", Toast.LENGTH_SHORT).show()

        }
    }
    private fun isValidCredentials(userName: String, password: String): Boolean {
        if (userName == Validusername && password == Valiidpassword) return true
        return false
    }
}