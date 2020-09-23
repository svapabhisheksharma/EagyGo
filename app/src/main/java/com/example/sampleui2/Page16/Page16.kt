package com.example.sampleui2.Page16

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.sampleui2.Page17.Page17
import com.example.sampleui2.Page18.Page18
import com.example.sampleui2.R

class Page16 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page16)

        val changePassword = findViewById<TextView>(R.id.change_password)

        changePassword.setOnClickListener {
            Log.d("change Password clicked","true")
            val intent = Intent(applicationContext, Page17::class.java)
            startActivity(intent)
        }

        val save = findViewById<Button>(R.id.save_page16)
        save.setOnClickListener {
            Toast.makeText(applicationContext,"Profile saved successfully", Toast.LENGTH_SHORT).show()
        }

        val back : ImageView = findViewById(R.id.page16_back)
        back.setOnClickListener {
            finish()
        }

    }
}