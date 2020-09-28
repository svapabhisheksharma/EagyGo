package com.example.sampleui2.Page32

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.R
import com.example.sampleui2.RvDecorationLinear
import kotlin.math.roundToInt

class Page32 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page32)

        val list = ArrayList<ModelPage32>()
        list.add(ModelPage32(R.drawable.ic_baseline_remove_circle_24,"Alok Jain","10-05-2021","Noice Ride"))
        list.add(ModelPage32(R.drawable.ic_baseline_remove_circle_24,"Alok Jain","10-05-2021",""))
        list.add(ModelPage32(R.drawable.ic_baseline_remove_circle_24,"Alok Jain","10-05-2021","Noice Ride"))
        list.add(ModelPage32(R.drawable.ic_baseline_remove_circle_24,"Alok Jain","10-05-2021",""))
        list.add(ModelPage32(R.drawable.ic_baseline_remove_circle_24,"Alok Jain","10-05-2021","Noice Ride"))
        list.add(ModelPage32(R.drawable.ic_baseline_remove_circle_24,"Alok Jain","10-05-2021",""))
        list.add(ModelPage32(R.drawable.ic_baseline_remove_circle_24,"Alok Jain","10-05-2021",""))
        list.add(ModelPage32(R.drawable.ic_baseline_remove_circle_24,"Alok Jain","10-05-2021","Noice Ride"))

        val rv : RecyclerView = findViewById(R.id.rvpage32)
        val lm = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rv.apply {
            adapter = AdapterPage32(list)
            layoutManager = lm
        }
        rv.addItemDecoration(RvDecorationLinear(
                (resources.displayMetrics.density * 18).roundToInt(),
                (resources.displayMetrics.density * 18).roundToInt()
        ))

        findViewById<ImageView>(R.id.page32_back).setOnClickListener {
            finish()
        }
    }
}