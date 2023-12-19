package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class caraBayar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cara_bayar)

        val  btnLanjut : TextView = findViewById(R.id.btnLanjut)


        btnLanjut.setOnClickListener {

            val intent = Intent(this, caraBayar::class.java)


            startActivity(intent)


            finish()
        }
    }

}