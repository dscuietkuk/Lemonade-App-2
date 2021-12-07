package com.example.lemonade_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var image3: ImageView
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        image3=findViewById(R.id.image3)
        image3.setOnClickListener{
            var intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}