package com.example.sampleui2.Page48

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.R
import com.example.sampleui2.RvDecorationLinear
import kotlin.math.roundToInt

class Page48 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page48)

        val rv :RecyclerView = findViewById(R.id.page48_rv)

        var list = ArrayList<Model48>()

        list.add(Model48("Maruti Suzuki Baleno","RJ 14 VC 3392",true,R.drawable.maxresdefault))
        list.add(Model48("Maruti Suzuki Baleno","RJ 14 VC 3392",false,R.drawable.maxresdefault))
        list.add(Model48("Maruti Suzuki Baleno","RJ 14 VC 3392",false,R.drawable.maxresdefault))
        list.add(Model48("Maruti Suzuki Baleno","RJ 14 VC 3392",false,R.drawable.maxresdefault))
        list.add(Model48("Maruti Suzuki Baleno","RJ 14 VC 3392",true,R.drawable.maxresdefault))
        list.add(Model48("Maruti Suzuki Baleno","RJ 14 VC 3392",false,R.drawable.maxresdefault))
        list.add(Model48("Maruti Suzuki Baleno","RJ 14 VC 3392",true,R.drawable.maxresdefault))
        list.add(Model48("Maruti Suzuki Baleno","RJ 14 VC 3392",true,R.drawable.maxresdefault))

        rv.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rv.adapter = Adapter48(list)

        rv.addItemDecoration(RvDecorationLinear(
                (resources.displayMetrics.density*18).roundToInt(),
                (resources.displayMetrics.density*30).roundToInt()
        ))

    }
}