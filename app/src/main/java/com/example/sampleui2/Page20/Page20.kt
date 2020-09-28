package com.example.sampleui2.Page20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.R

class Page20 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page20)

        val list = listOf(
                ModelPage20(0),
                ModelPage20(1),
                ModelPage20(1),
                ModelPage20(1),
                ModelPage20(1),
                ModelPage20(1),
        )

        val rv :RecyclerView = findViewById(R.id.rv_page20)
        rv.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rv.adapter = Adapter20(list)

        findViewById<ImageView>(R.id.page20_back).setOnClickListener {
            finish()
        }

    }
}