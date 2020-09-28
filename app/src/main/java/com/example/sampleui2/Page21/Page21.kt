package com.example.sampleui2.Page21

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.sampleui2.Page22.Page22
import com.example.sampleui2.R

class Page21 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page21)
        findViewById<ImageView>(R.id.page21_back).setOnClickListener {
            finish()
        }
        findViewById<Button>(R.id.buttonP21).setOnClickListener {
            startActivity(Intent(this, Page22::class.java))
        }
    }
}