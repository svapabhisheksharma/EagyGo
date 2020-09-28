package com.example.sampleui2.Page29

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.Page22.Page22
import com.example.sampleui2.Page23.Adapter23
import com.example.sampleui2.Page31.Page31
import com.example.sampleui2.R
import com.example.sampleui2.RvDecorationLinear
import kotlin.math.roundToInt

class Page29 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page29)
        val rv: RecyclerView = findViewById(R.id.rv_page29)

        val list = listOf(
                Model29(0,"Minimal Age","25 Years"),
                Model29(0,"Minimal Renting Period ","2 Days"),
                Model29(0,"Preparation Time ","2 Days"),
                Model29(1,"Kids Allowed","25 Years"),
                Model29(1,"Smoking Allowed","25 Years"),
                Model29(1,"Abroad Allowed","25 Years"),
                Model29(1,"Abroad Allowed","25 Years"),
                )

        rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        rv.adapter = Adapter29(list)

        rv.addItemDecoration(RvDecorationLinear(
                (resources.displayMetrics.density * 18).roundToInt(),
                (resources.displayMetrics.density * 18).roundToInt()
        ))
        findViewById<ImageView>(R.id.page29_back).setOnClickListener {
            finish()
        }
        findViewById<Button>(R.id.buttonP29).setOnClickListener {
            startActivity(Intent(this, Page31::class.java))
        }
    }
}