package com.example.lemonade_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity1 : AppCompatActivity() {
    lateinit var image1:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main1)
        image1=findViewById(R.id.image1)
        image1.setOnClickListener{
            var intent=Intent(this,MainActivity2::class.java)
            startActivity(intent)
            finish()
        }
    }
}