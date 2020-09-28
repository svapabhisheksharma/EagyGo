package com.example.sampleui2.Page43

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.Page29.Adapter29
import com.example.sampleui2.Page29.Model29
import com.example.sampleui2.R
import com.example.sampleui2.RvDecorationLinear
import kotlin.math.roundToInt

class Page43 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page43)
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN)
        val rv: RecyclerView = findViewById(R.id.page43_rv)

        val list = listOf(
                Model43(0),
                Model43(1),
                Model43(2)
        )

        rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        rv.adapter = Adapter43(list)

        findViewById<ImageView>(R.id.page43_back).setOnClickListener {
            finish()
        }
    }
}