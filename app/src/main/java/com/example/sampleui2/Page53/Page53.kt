package com.example.sampleui2.Page53

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sampleui2.R
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class Page53 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page53)

        var textfield : TextInputLayout = findViewById(R.id.TextLayoutPage53)

        textfield.setEndIconOnClickListener {
            textfield.editText?.text = null
        }

    }
}