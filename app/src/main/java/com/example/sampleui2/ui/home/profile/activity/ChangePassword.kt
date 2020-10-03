package com.example.sampleui2.ui.home.profile.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.example.sampleui2.R

class ChangePassword : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_edit_changepassword_activity)

        val back = findViewById<ImageView>(R.id.img_back)


        back.setOnClickListener {
            finish()
        }
        val save = findViewById<Button>(R.id.btn_save)
        save.setOnClickListener {
            Toast.makeText(applicationContext,"Password Changed Successfully",Toast.LENGTH_SHORT).show()
        }
    }
}