package com.example.sampleui2.ui.other.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.ui.other.adapter.ReviewsAdapter
import com.example.sampleui2.ui.other.model.ReviewsModel
import com.example.sampleui2.R
import com.example.sampleui2.RvDecorationLinear
import kotlin.math.roundToInt

class Reviews : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.other_reviews_activity)

        val list = ArrayList<ReviewsModel>()
        list.add(ReviewsModel(R.drawable.ic_baseline_remove_circle_24,"Alok Jain","10-05-2021","Noice Ride"))
        list.add(ReviewsModel(R.drawable.ic_baseline_remove_circle_24,"Alok Jain","10-05-2021",""))
        list.add(ReviewsModel(R.drawable.ic_baseline_remove_circle_24,"Alok Jain","10-05-2021","Noice Ride"))
        list.add(ReviewsModel(R.drawable.ic_baseline_remove_circle_24,"Alok Jain","10-05-2021",""))
        list.add(ReviewsModel(R.drawable.ic_baseline_remove_circle_24,"Alok Jain","10-05-2021","Noice Ride"))
        list.add(ReviewsModel(R.drawable.ic_baseline_remove_circle_24,"Alok Jain","10-05-2021",""))
        list.add(ReviewsModel(R.drawable.ic_baseline_remove_circle_24,"Alok Jain","10-05-2021",""))
        list.add(ReviewsModel(R.drawable.ic_baseline_remove_circle_24,"Alok Jain","10-05-2021","Noice Ride"))

        val rv : RecyclerView = findViewById(R.id.recyclerview)
        val lm = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rv.apply {
            adapter = ReviewsAdapter(list)
            layoutManager = lm
        }
        rv.addItemDecoration(RvDecorationLinear(
                (resources.displayMetrics.density * 18).roundToInt(),
                (resources.displayMetrics.density * 18).roundToInt()
        ))

        findViewById<ImageView>(R.id.img_back).setOnClickListener {
            finish()
        }
    }
}