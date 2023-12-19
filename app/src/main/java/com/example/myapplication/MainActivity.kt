package com.example.myapplication


import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private val SPLASH_TIME_OUT: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()


        Handler().postDelayed({

            val intent = Intent(this, Login::class.java)
            startActivity(intent)


            finish()
        }, SPLASH_TIME_OUT)
    }
}
