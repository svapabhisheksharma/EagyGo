package com.example.sampleui2.ui.other.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.sampleui2.R

class CarPicture1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.other_carpicture_1_activity)
        findViewById<ImageView>(R.id.page27_back).setOnClickListener {
            finish()
        }
        findViewById<Button>(R.id.buttonP27).setOnClickListener {
            startActivity(Intent(this, CarPicture2::class.java))
        }
    }
}