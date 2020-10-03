package com.example.sampleui2.ui.other.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.ui.other.adapter.CarDamagesAdapter
import com.example.sampleui2.ui.other.model.CarDamagesModel
import com.example.sampleui2.R
import com.example.sampleui2.RvDecorationGrid
import kotlin.math.roundToInt

class CarDamages : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.other_cardamages_activity)

        var list = ArrayList<CarDamagesModel>()
        list.add(CarDamagesModel(R.drawable.maxresdefault))
        list.add(CarDamagesModel(R.drawable.maxresdefault))
        list.add(CarDamagesModel(R.drawable.maxresdefault))
        list.add(CarDamagesModel(R.drawable.maxresdefault))
        list.add(CarDamagesModel(R.drawable.maxresdefault))
        list.add(CarDamagesModel(R.drawable.maxresdefault))

        val rv : RecyclerView = findViewById(R.id.page50_rv)

        rv.layoutManager = GridLayoutManager(this,2)
        rv.adapter = CarDamagesAdapter(list)
        rv.addItemDecoration(RvDecorationGrid(
                2,
                (resources.displayMetrics.density*20).roundToInt(),
                true
        ))
    }
}