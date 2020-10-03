package com.example.sampleui2.ui.home.profile.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.ui.home.profile.adapter.PerformanceAdapter
import com.example.sampleui2.ui.home.profile.model.PerformanceModel
import com.example.sampleui2.R

class Performance : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_settings_performance_activity)

        val list = listOf(
                PerformanceModel(0),
                PerformanceModel(1),
                PerformanceModel(1),
                PerformanceModel(1),
                PerformanceModel(1),
                PerformanceModel(1),
        )

        val rv :RecyclerView = findViewById(R.id.rv_page20)
        rv.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rv.adapter = PerformanceAdapter(list)

        findViewById<ImageView>(R.id.page20_back).setOnClickListener {
            finish()
        }

    }
}