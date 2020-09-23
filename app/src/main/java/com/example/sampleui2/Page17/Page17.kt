package com.example.sampleui2.Page17

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.example.sampleui2.R

class Page17 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page17)

        val back = findViewById<ImageView>(R.id.page17_back)


        back.setOnClickListener {
            finish()
        }
        val save = findViewById<Button>(R.id.page17_save)
        save.setOnClickListener {
            Toast.makeText(applicationContext,"Password Changed Successfully",Toast.LENGTH_SHORT).show()
        }
    }
}