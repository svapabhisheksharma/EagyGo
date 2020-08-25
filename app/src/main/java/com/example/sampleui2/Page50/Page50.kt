package com.example.sampleui2.Page50

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.R
import com.example.sampleui2.RvDecorationGrid
import kotlin.math.roundToInt

class Page50 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page50)

        var list = ArrayList<Model50>()
        list.add(Model50(R.drawable.maxresdefault))
        list.add(Model50(R.drawable.maxresdefault))
        list.add(Model50(R.drawable.maxresdefault))
        list.add(Model50(R.drawable.maxresdefault))
        list.add(Model50(R.drawable.maxresdefault))
        list.add(Model50(R.drawable.maxresdefault))

        val rv : RecyclerView = findViewById(R.id.page50_rv)

        rv.layoutManager = GridLayoutManager(this,2)
        rv.adapter = Adapter50(list)
        rv.addItemDecoration(RvDecorationGrid(
                2,
                (resources.displayMetrics.density*20).roundToInt(),
                true
        ))
    }
}