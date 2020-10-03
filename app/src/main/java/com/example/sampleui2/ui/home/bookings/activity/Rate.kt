package com.example.sampleui2.ui.home.bookings.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.ui.home.bookings.adapter.RateAdapter
import com.example.sampleui2.ui.home.bookings.model.RateModel
import com.example.sampleui2.R

class Rate : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.booking_tile_rate_activity)
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN)
        val rv: RecyclerView = findViewById(R.id.recyclerview)

        val list = listOf(
                RateModel(0),
                RateModel(1),
                RateModel(2)
        )

        rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        rv.adapter = RateAdapter(list)

        findViewById<ImageView>(R.id.img_back).setOnClickListener {
            finish()
        }
    }
}