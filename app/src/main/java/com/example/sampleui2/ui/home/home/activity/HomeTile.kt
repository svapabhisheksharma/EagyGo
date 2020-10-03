package com.example.sampleui2.ui.home.home.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.ui.home.home.adapter.HomeTileAdapter
import com.example.sampleui2.ui.home.home.model.HomeTileModel
import com.example.sampleui2.R

class HomeTile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_favourite_tile_activity)

        var list =ArrayList<HomeTileModel>()

        list.add(HomeTileModel(0))
        list.add(HomeTileModel(1))
        list.add(HomeTileModel(2))
        list.add(HomeTileModel(3))
        list.add(HomeTileModel(4))
        list.add(HomeTileModel(5))
        val rv:RecyclerView = findViewById(R.id.rv_page11)
        rv.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        val adapterp11 = HomeTileAdapter(list,this)
        rv.adapter = adapterp11

        findViewById<ImageView>(R.id.page11back).setOnClickListener {
            finish()
        }

        val check :ConstraintLayout = findViewById(R.id.checklayoutp11)

        val text : TextView = findViewById(R.id.textcheck)

        check.setOnClickListener {
           list.removeAt(2)
            list.add(2, HomeTileModel(6))
            text.text = "BOOK"
            adapterp11.notifyDataSetChanged()
        }
    }
}