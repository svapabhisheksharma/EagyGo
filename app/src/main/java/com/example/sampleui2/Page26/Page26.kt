package com.example.sampleui2.Page26

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.sampleui2.Page22.Page22
import com.example.sampleui2.Page27.Page27
import com.example.sampleui2.R

class Page26 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page26)
        findViewById<ImageView>(R.id.page26_back).setOnClickListener {
            finish()
        }
        findViewById<Button>(R.id.buttonP26).setOnClickListener {
            startActivity(Intent(this, Page27::class.java))
        }
    }
}