package com.example.sampleui2.ui.other.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.sampleui2.R

class CarAbout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.other_carabout_activity)
        findViewById<ImageView>(R.id.page22_back).setOnClickListener {
            finish()
        }
        findViewById<Button>(R.id.buttonP22).setOnClickListener {
            startActivity(Intent(this, CarAccesories::class.java))
        }
    }
}