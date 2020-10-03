package com.example.sampleui2.ui.other.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.ui.other.adapter.MyCarsAdapter
import com.example.sampleui2.ui.other.model.MyCarsModel
import com.example.sampleui2.R
import com.example.sampleui2.RvDecorationLinear
import kotlin.math.roundToInt

class MyCars : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.other_mycars_activity)

        val rv :RecyclerView = findViewById(R.id.page48_rv)

        var list = ArrayList<MyCarsModel>()

        list.add(MyCarsModel("Maruti Suzuki Baleno","RJ 14 VC 3392",true,R.drawable.maxresdefault))
        list.add(MyCarsModel("Maruti Suzuki Baleno","RJ 14 VC 3392",false,R.drawable.maxresdefault))
        list.add(MyCarsModel("Maruti Suzuki Baleno","RJ 14 VC 3392",false,R.drawable.maxresdefault))
        list.add(MyCarsModel("Maruti Suzuki Baleno","RJ 14 VC 3392",false,R.drawable.maxresdefault))
        list.add(MyCarsModel("Maruti Suzuki Baleno","RJ 14 VC 3392",true,R.drawable.maxresdefault))
        list.add(MyCarsModel("Maruti Suzuki Baleno","RJ 14 VC 3392",false,R.drawable.maxresdefault))
        list.add(MyCarsModel("Maruti Suzuki Baleno","RJ 14 VC 3392",true,R.drawable.maxresdefault))
        list.add(MyCarsModel("Maruti Suzuki Baleno","RJ 14 VC 3392",true,R.drawable.maxresdefault))

        rv.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rv.adapter = MyCarsAdapter(list)

        rv.addItemDecoration(RvDecorationLinear(
                (resources.displayMetrics.density*18).roundToInt(),
                (resources.displayMetrics.density*30).roundToInt()
        ))

    }
}