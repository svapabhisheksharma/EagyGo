package com.example.sampleui2.ui.home.home.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.R
import com.example.sampleui2.RvDecorationLinear
import kotlin.math.roundToInt

class Home3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_activity_3)

        val rv: RecyclerView = findViewById(R.id.page_10_rv)

        rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        //rv.adapter = Adapter8910(6)

        rv.addItemDecoration(RvDecorationLinear(
                (resources.displayMetrics.density * 16).roundToInt(),
                (resources.displayMetrics.density * 16).roundToInt()
        ))
    }
}