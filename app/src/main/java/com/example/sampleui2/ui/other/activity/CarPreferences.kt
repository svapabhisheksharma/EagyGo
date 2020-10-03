package com.example.sampleui2.ui.other.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.ui.other.adapter.CarPreferencesAdapter
import com.example.sampleui2.ui.other.model.CarPreferencesModel
import com.example.sampleui2.R
import com.example.sampleui2.RvDecorationLinear
import kotlin.math.roundToInt

class CarPreferences : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.other_carpreferences_activity)
        val rv: RecyclerView = findViewById(R.id.rv_page29)

        val list = listOf(
                CarPreferencesModel(0,"Minimal Age","25 Years"),
                CarPreferencesModel(0,"Minimal Renting Period ","2 Days"),
                CarPreferencesModel(0,"Preparation Time ","2 Days"),
                CarPreferencesModel(1,"Kids Allowed","25 Years"),
                CarPreferencesModel(1,"Smoking Allowed","25 Years"),
                CarPreferencesModel(1,"Abroad Allowed","25 Years"),
                CarPreferencesModel(1,"Abroad Allowed","25 Years"),
                )

        rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        rv.adapter = CarPreferencesAdapter(list)

        rv.addItemDecoration(RvDecorationLinear(
                (resources.displayMetrics.density * 18).roundToInt(),
                (resources.displayMetrics.density * 18).roundToInt()
        ))
        findViewById<ImageView>(R.id.page29_back).setOnClickListener {
            finish()
        }
        findViewById<Button>(R.id.buttonP29).setOnClickListener {
            startActivity(Intent(this, FinalPage::class.java))
        }
    }
}