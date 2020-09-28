package com.example.sampleui2.Page1112

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.R

class Page11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page11)

        var list =ArrayList<ModelPage11>()

        list.add(ModelPage11(0))
        list.add(ModelPage11(1))
        list.add(ModelPage11(2))
        list.add(ModelPage11(3))
        list.add(ModelPage11(4))
        list.add(ModelPage11(5))
        val rv:RecyclerView = findViewById(R.id.rv_page11)
        rv.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        val adapterp11 = AdapterPage11(list,this)
        rv.adapter = adapterp11

        findViewById<ImageView>(R.id.page11back).setOnClickListener {
            finish()
        }

        val check :ConstraintLayout = findViewById(R.id.checklayoutp11)

        val text : TextView = findViewById(R.id.textcheck)

        check.setOnClickListener {
           list.removeAt(2)
            list.add(2, ModelPage11(6))
            text.text = "BOOK"
            adapterp11.notifyDataSetChanged()
        }
    }
}