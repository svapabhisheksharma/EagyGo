package com.example.sampleui2.Page28

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.sampleui2.Page22.Page22
import com.example.sampleui2.Page29.Page29
import com.example.sampleui2.R

class Page28 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page28)
        findViewById<ImageView>(R.id.page28_back).setOnClickListener {
            finish()
        }
        findViewById<Button>(R.id.buttonP28).setOnClickListener {
            startActivity(Intent(this, Page29::class.java))
        }
    }
}