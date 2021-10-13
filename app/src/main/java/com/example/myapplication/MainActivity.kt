package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGoSubActivity: Button by lazy {
            findViewById(R.id.button)
        }

        btnGoSubActivity.setOnClickListener {
            val intent = Intent(this, SubActivity::class.java)

            startActivity(intent)
        }
        val btnGoSubActivity3: Button by lazy {
            findViewById(R.id.button2)
        }

        btnGoSubActivity3.setOnClickListener {
            val intent = Intent(this, SubActivity3::class.java)

            startActivity(intent)
        }
        val btnGoImage: Button by lazy {
            findViewById(R.id.button3)
        }

        btnGoImage.setOnClickListener {
            val intent = Intent(this, Image::class.java)

            startActivity(intent)
        }
    }
}