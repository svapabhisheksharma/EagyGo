package com.example.sampleui2.ui.other.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.sampleui2.ui.home.activity.MainActivity
import com.example.sampleui2.R

class FinalPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.other_final_activity)
        findViewById<Button>(R.id.buttonP31).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}