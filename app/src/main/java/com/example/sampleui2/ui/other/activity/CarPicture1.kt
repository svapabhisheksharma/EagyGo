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
        findViewById<ImageView>(R.id.img_back).setOnClickListener {
            finish()
        }
        findViewById<Button>(R.id.btn_continue).setOnClickListener {
            startActivity(Intent(this, CarPicture2::class.java))
        }
    }
}