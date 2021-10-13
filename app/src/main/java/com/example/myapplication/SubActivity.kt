package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_sub.*

const val KEY_TEXT = "text"
class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val btnresult: Button by lazy {
            findViewById(R.id.btnresult)
        }
        btnresult.setOnClickListener() {
            val text = etname.text.toString()
            val int = etage.text.toString()

            if (text.isEmpty()) return@setOnClickListener
            val intent = Intent(this, SubActivity2::class.java).apply {
                putExtra(KEY_TEXT, text)
                putExtra(KEY_TEXT, int)
            }
                startActivity(intent)
            }
        }
    }