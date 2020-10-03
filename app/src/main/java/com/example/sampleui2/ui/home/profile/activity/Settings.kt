package com.example.sampleui2.ui.home.profile.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.ui.home.profile.adapter.SettingsAdapter
import com.example.sampleui2.ui.home.profile.model.SettingsModel
import com.example.sampleui2.ui.other.activity.CarNumber
import com.example.sampleui2.R
import com.example.sampleui2.RvDecorationLinear
import kotlin.math.roundToInt

class Settings : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_settings_activity)

        val back : ImageView = findViewById(R.id.img_back)
        val list = ArrayList<SettingsModel>()
        list.add(SettingsModel("Car Performance",R.drawable.ic_performance))
        list.add(SettingsModel("About Us",R.drawable.ic_aboutus))
        list.add(SettingsModel("Privacy Policy",R.drawable.ic_privacy_policy))
        list.add(SettingsModel("Refund Policy",R.drawable.ic_refund))
        list.add(SettingsModel("Contact Support",R.drawable.ic_support))

        val rv = findViewById<RecyclerView>(R.id.recyclerview)

        rv.adapter = SettingsAdapter(list,this::itemClickHandler)
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
                val intent = Intent(this, Performance::class.java)
                startActivity(intent)
            }
            1->{
                val intent = Intent(this, CarNumber::class.java)
                startActivity(intent)
            }
            2->{
                val intent = Intent(this, PrivacyPolicy::class.java)
                startActivity(intent)
            }
            3->{
                val intent = Intent(this, PrivacyPolicy::class.java)
                startActivity(intent)
            }
            else->{
                val intent = Intent(this, PrivacyPolicy::class.java)
                startActivity(intent)
            }
        }

    }
}