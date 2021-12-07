package com.example.lemonade_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    lateinit var image2: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        image2=findViewById(R.id.image2)
        image2.setOnClickListener{
            var intent= Intent(this,MainActivity3::class.java)
            startActivity(intent)
            finish()
        }
    }
}