package com.example.sampleui2.Page18

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.Page19.Page19
import com.example.sampleui2.Page20.Page20
import com.example.sampleui2.Page21.Page21
import com.example.sampleui2.R
import com.example.sampleui2.RvDecorationLinear
import kotlin.math.roundToInt

class Page18 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page18)

        val back : ImageView = findViewById(R.id.page18_back)
        val list = ArrayList<ModelPAge18>()
        list.add(ModelPAge18("Car Performance",R.drawable.ic_performance))
        list.add(ModelPAge18("About Us",R.drawable.ic_aboutus))
        list.add(ModelPAge18("Privacy Policy",R.drawable.ic_privacy_policy))
        list.add(ModelPAge18("Refund Policy",R.drawable.ic_refund))
        list.add(ModelPAge18("Contact Support",R.drawable.ic_support))

        val rv = findViewById<RecyclerView>(R.id.rvpage18)

        rv.adapter = AdapterPage18(list,this::itemClickHandler)
        rv.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rv.addItemDecoration(RvDecorationLinear(
                (resources.displayMetrics.density * 0).roundToInt(),
                (resources.displayMetrics.density * 16).roundToInt()
        ))

        back.setOnClickListener {
            finish()
        }

    }

    fun itemClickHandler(position:Int){
        when(position){
            0->{
                val intent = Intent(this, Page20::class.java)
                startActivity(intent)
            }
            1->{
                val intent = Intent(this, Page21::class.java)
                startActivity(intent)
            }
            2->{
                val intent = Intent(this, Page19::class.java)
                startActivity(intent)
            }
            3->{
                val intent = Intent(this, Page19::class.java)
                startActivity(intent)
            }
            else->{
                val intent = Intent(this, Page19::class.java)
                startActivity(intent)
            }
        }

    }
}