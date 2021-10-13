package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_sub2.*

class SubActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub2)
        tvname.text = intent.getStringExtra(KEY_TEXT)
        tvage.text = intent.getStringExtra(KEY_TEXT)
    }
}