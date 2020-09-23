package com.example.sampleui2.Page41

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.Page8910.AdapterFrag40
import com.example.sampleui2.R
import com.example.sampleui2.RvDecorationLinear
import kotlin.math.roundToInt

class Page41 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page41)
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN)

        val list = listOf(
                ModelPage41(0,"Hellow Vincent, thank you " +
                        "for calling Provide.","10:30"),
                ModelPage41(1,"Perfect, I am really glad " +
                        "to hear that!","10:30"),
                ModelPage41(0,"I am really sorry to hear that." +
                        "Is there anything I can do to help " +
                        "you?","10:32"),
                ModelPage41(1,"That's is a good","10:32"),
                ModelPage41(0,"I'm not sure, but let me find","10:33")
        )

        val rv :RecyclerView = findViewById(R.id.rvpage41)
        rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        rv.adapter = AdapterPage41(list)
        rv.addItemDecoration(RvDecorationLinear(
                (resources.displayMetrics.density * 0).roundToInt(),
                (resources.displayMetrics.density *7 ).roundToInt()
        ))

        val heading :TextView = findViewById(R.id.page41_heading)
        val image :ImageView = findViewById(R.id.image_page41)

        heading.text = intent.extras?.getString("name")
        intent.extras?.getInt("resource")?.let { image.setImageResource(it) }

        findViewById<ImageView>(R.id.page41_back).setOnClickListener { 
            finish()
        }

    }
}