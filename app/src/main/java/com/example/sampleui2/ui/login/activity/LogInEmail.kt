package com.example.sampleui2.ui.login.activity

import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.text.style.StyleSpan
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.sampleui2.R

class LogInEmail : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login_signinemail)

        val textview:TextView = findViewById(R.id.spannabletext)

        var text = "No Account Yet?  Sign Up"

        var ss  = SpannableString(text)

        val boldspan = StyleSpan(Typeface.BOLD)
        val fcsblue = ForegroundColorSpan(Color.parseColor("#2680eb"))

        ss.setSpan(fcsblue , 17,24, Spanned.SPAN_INCLUSIVE_EXCLUSIVE)
        ss.setSpan(boldspan , 17,24, Spanned.SPAN_INCLUSIVE_EXCLUSIVE)

        textview.text = ss



    }
}