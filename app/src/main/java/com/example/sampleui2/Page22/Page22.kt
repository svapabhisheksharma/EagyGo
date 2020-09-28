package com.example.sampleui2.Page22

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.sampleui2.Page23.Page23
import com.example.sampleui2.R

class Page22 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page22)
        findViewById<ImageView>(R.id.page22_back).setOnClickListener {
            finish()
        }
        findViewById<Button>(R.id.buttonP22).setOnClickListener {
            startActivity(Intent(this, Page23::class.java))
        }
    }
}