package com.example.sampleui2.ui.other.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.sampleui2.R

class CarFreeKM : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.other_carfreekm_activity)
        findViewById<ImageView>(R.id.page25_back).setOnClickListener {
            finish()
        }
        findViewById<Button>(R.id.buttonP25).setOnClickListener {
            startActivity(Intent(this, CarInsurance::class.java))
        }
    }
}