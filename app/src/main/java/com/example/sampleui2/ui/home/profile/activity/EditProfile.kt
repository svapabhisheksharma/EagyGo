package com.example.sampleui2.ui.home.profile.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.sampleui2.R

class EditProfile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_edit_activity)

        val changePassword = findViewById<TextView>(R.id.txt_xhangepassword)

        changePassword.setOnClickListener {
            Log.d("change Password clicked","true")
            val intent = Intent(applicationContext, ChangePassword::class.java)
            startActivity(intent)
        }

        val save = findViewById<Button>(R.id.btn_save)
        save.setOnClickListener {
            Toast.makeText(applicationContext,"Profile saved successfully", Toast.LENGTH_SHORT).show()
        }

        val back : ImageView = findViewById(R.id.img_back)
        back.setOnClickListener {
            finish()
        }

    }
}