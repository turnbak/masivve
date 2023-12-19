package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)


    val btnRekom: TextView = findViewById(R.id.logout_Btn)


    btnRekom.setOnClickListener {

        val intent = Intent(this, Login::class.java)


        startActivity(intent)


        finish()
    }
    }
}