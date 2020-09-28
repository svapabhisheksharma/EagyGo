package com.example.sampleui2.Page31

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.sampleui2.MainActivity
import com.example.sampleui2.R

class Page31 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page31)
        findViewById<Button>(R.id.buttonP31).setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}