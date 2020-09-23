package com.example.sampleui2.Page6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import com.example.sampleui2.R
import com.google.android.material.textfield.TextInputLayout

class Page6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page6)

        val textinputlayout : TextInputLayout = findViewById(R.id.textinputlayoutp6)

        textinputlayout.editText?.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                TODO("Not yet implemented")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val c = android.util.Patterns.EMAIL_ADDRESS.matcher(textinputlayout.editText?.text.toString()).matches()
                if (!c)
                    textinputlayout.error = "Email address is not valid"
                else
                    textinputlayout.error = null
            }

            override fun afterTextChanged(s: Editable?) {
                TODO("Not yet implemented")
            }

        })

    }
}