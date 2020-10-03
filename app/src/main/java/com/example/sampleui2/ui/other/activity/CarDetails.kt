package com.example.sampleui2.ui.other.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.ui.other.adapter.CarDetailsAdapter
import com.example.sampleui2.R
import com.example.sampleui2.RvDecorationLinear
import kotlin.math.roundToInt

class CarDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.other_cardetails_activity)
        val rv: RecyclerView = findViewById(R.id.recyclerview)

        rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        rv.adapter = CarDetailsAdapter(6)

        rv.addItemDecoration(RvDecorationLinear(
                (resources.displayMetrics.density * 18).roundToInt(),
                (resources.displayMetrics.density * 18).roundToInt()
        ))
        findViewById<ImageView>(R.id.img_back).setOnClickListener {
            finish()
        }
        findViewById<Button>(R.id.btn_continue).setOnClickListener {
            startActivity(Intent(this, CarFreeKM::class.java))
        }
    }
}