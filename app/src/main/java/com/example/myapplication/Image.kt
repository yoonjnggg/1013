package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.content.res.AppCompatResources
import kotlinx.android.synthetic.main.activity_image.*

class Image : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        val imageView: ImageView = findViewById(R.id.imageView)
        val btnchange: Button = findViewById(R.id.btnchange)

       // imageView.visibility = View.INVISIBLE; // 처음에 이미지 안 보임

        btnchange.setOnClickListener {
            imageView.visibility = View.VISIBLE;
            imageView.setImageDrawable(AppCompatResources.getDrawable(this, R.drawable.dog))
        }
        btnchange.setOnLongClickListener {
            imageView.setImageDrawable(AppCompatResources.getDrawable(this, R.drawable.cat))

            true
        }
    }
}