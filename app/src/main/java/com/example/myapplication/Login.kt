package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        val btnLogin: Button = findViewById(R.id.btnLogin)


        btnLogin.setOnClickListener {

            val intent = Intent(this, HomePage::class.java)


            startActivity(intent)


            finish()
        }
        val btnRegis: Button = findViewById(R.id.btnRegistresi)


        btnRegis.setOnClickListener {

            val intent = Intent(this, Register::class.java)


            startActivity(intent)


            finish()
        }
    }
}