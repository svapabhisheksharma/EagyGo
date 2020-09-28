package com.example.sampleui2.Page24

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.Page22.Page22
import com.example.sampleui2.Page23.Adapter23
import com.example.sampleui2.Page25.Page25
import com.example.sampleui2.R
import com.example.sampleui2.RvDecorationLinear
import kotlin.math.roundToInt

class Page24 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page24)
        val rv: RecyclerView = findViewById(R.id.rv_page24)

        rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        rv.adapter = Adapter24(6)

        rv.addItemDecoration(RvDecorationLinear(
                (resources.displayMetrics.density * 18).roundToInt(),
                (resources.displayMetrics.density * 18).roundToInt()
        ))
        findViewById<ImageView>(R.id.page24_back).setOnClickListener {
            finish()
        }
        findViewById<Button>(R.id.buttonP24).setOnClickListener {
            startActivity(Intent(this, Page25::class.java))
        }
    }
}