package com.example.sampleui2.Page27

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.sampleui2.Page22.Page22
import com.example.sampleui2.Page28.Page28
import com.example.sampleui2.R

class Page27 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page27)
        findViewById<ImageView>(R.id.page27_back).setOnClickListener {
            finish()
        }
        findViewById<Button>(R.id.buttonP27).setOnClickListener {
            startActivity(Intent(this, Page28::class.java))
        }
    }
}