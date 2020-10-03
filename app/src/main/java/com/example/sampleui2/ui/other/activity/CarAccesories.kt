package com.example.sampleui2.ui.other.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.ui.other.adapter.CarAccesoriesAdapter
import com.example.sampleui2.R
import com.example.sampleui2.RvDecorationLinear
import kotlin.math.roundToInt

class CarAccesories : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.other_caraccesories_activity)

        val rv: RecyclerView = findViewById(R.id.rv_page23)

        rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        rv.adapter = CarAccesoriesAdapter(6)

        rv.addItemDecoration(RvDecorationLinear(
                (resources.displayMetrics.density * 18).roundToInt(),
                (resources.displayMetrics.density * 18).roundToInt()
        ))
        findViewById<ImageView>(R.id.page23_back).setOnClickListener {
            finish()
        }

        findViewById<Button>(R.id.buttonP23).setOnClickListener {
            startActivity(Intent(this, CarDetails::class.java))
        }
    }
}