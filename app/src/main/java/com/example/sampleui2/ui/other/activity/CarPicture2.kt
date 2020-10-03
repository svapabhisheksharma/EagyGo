package com.example.sampleui2.ui.other.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.sampleui2.R

class CarPicture2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.other_carpicture_2_activity)
        findViewById<ImageView>(R.id.img_back).setOnClickListener {
            finish()
        }
        findViewById<Button>(R.id.buttonP28).setOnClickListener {
            startActivity(Intent(this, CarPreferences::class.java))
        }
    }
}