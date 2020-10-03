package com.example.sampleui2.ui.other.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sampleui2.R
import com.google.android.material.textfield.TextInputLayout

class DrivingLiscense : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.other_drivingliscense_activity)

        var textfield : TextInputLayout = findViewById(R.id.edtxt_drivingliscense)

        textfield.setEndIconOnClickListener {
            textfield.editText?.text = null
        }

    }
}