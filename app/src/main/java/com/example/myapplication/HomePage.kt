package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        title = "Home"

        val btnRekom: TextView = findViewById(R.id.semuarecom)

        btnRekom.setOnClickListener {

            val intent = Intent(this, BuatSayurSop::class.java)

            startActivity(intent)

            finish()
        }
        val btnPromo: TextView = findViewById(R.id.semuapromo)

        btnPromo.setOnClickListener {

            val intent = Intent(this, BuatSayurSop::class.java)

            startActivity(intent)

            finish()

            
        }
        val btnProfile: ImageButton = findViewById(R.id.profile)

        btnProfile.setOnClickListener{

            val intent = Intent(this, Profile::class.java)

            startActivity(intent)

            finish()

        }

    }
}
