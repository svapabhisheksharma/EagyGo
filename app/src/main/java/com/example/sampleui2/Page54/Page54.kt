package com.example.sampleui2.Page54

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sampleui2.R
import com.google.android.material.textfield.TextInputLayout

class Page54 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page54)

        var textfield : TextInputLayout = findViewById(R.id.TextLayoutPage54)

        textfield.setEndIconOnClickListener {
            textfield.editText?.text = null
        }

    }
}