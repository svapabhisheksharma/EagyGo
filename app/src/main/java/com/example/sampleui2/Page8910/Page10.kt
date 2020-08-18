package com.example.sampleui2.Page8910

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.R
import com.example.sampleui2.RvDecoration
import kotlin.math.roundToInt

class Page10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page10)

        val rv: RecyclerView = findViewById(R.id.page_10_rv)

        rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        rv.adapter = Adapter8910(6)

        rv.addItemDecoration(RvDecoration(
                (resources.displayMetrics.density * 16).roundToInt(),
                (resources.displayMetrics.density * 16).roundToInt()
        ))
    }
}