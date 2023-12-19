package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Register : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btnlgn: TextView = findViewById(R.id.text1)

        btnlgn.setOnClickListener {

            val intent = Intent(this, Login::class.java)

            startActivity(intent)

            finish()
        }
    }
}