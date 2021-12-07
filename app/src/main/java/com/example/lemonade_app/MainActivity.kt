package com.example.lemonade_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var image:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        image=findViewById(R.id.image)
        image.setOnClickListener{
            var intent= Intent(this,MainActivity1::class.java)
            startActivity(intent)
            finish()

        }
    }
}