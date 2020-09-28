package com.example.sampleui2.Page25

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.sampleui2.Page22.Page22
import com.example.sampleui2.Page26.Page26
import com.example.sampleui2.R

class Page25 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page25)
        findViewById<ImageView>(R.id.page25_back).setOnClickListener {
            finish()
        }
        findViewById<Button>(R.id.buttonP25).setOnClickListener {
            startActivity(Intent(this, Page26::class.java))
        }
    }
}