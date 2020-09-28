package com.example.sampleui2.Page23

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.Page22.Page22
import com.example.sampleui2.Page24.Page24
import com.example.sampleui2.Page8910.Adapter8910
import com.example.sampleui2.R
import com.example.sampleui2.RvDecorationLinear
import kotlin.math.roundToInt

class Page23 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page23)

        val rv: RecyclerView = findViewById(R.id.rv_page23)

        rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        rv.adapter = Adapter23(6)

        rv.addItemDecoration(RvDecorationLinear(
                (resources.displayMetrics.density * 18).roundToInt(),
                (resources.displayMetrics.density * 18).roundToInt()
        ))
        findViewById<ImageView>(R.id.page23_back).setOnClickListener {
            finish()
        }

        findViewById<Button>(R.id.buttonP23).setOnClickListener {
            startActivity(Intent(this, Page24::class.java))
        }
    }
}