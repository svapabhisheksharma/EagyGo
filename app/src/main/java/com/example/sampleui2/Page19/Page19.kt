package com.example.sampleui2.Page19

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.R
import com.example.sampleui2.RvDecorationLinear
import kotlin.math.roundToInt

class Page19 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page19)

        var rv : RecyclerView = findViewById(R.id.rv_page19)

        var list19 = ArrayList<Model19>()

        list19.add(Model19("Heading1","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam dictum orci vel elit iaculis laoreet. Duis et tincidunt urna, id tincidunt sapien. Sed non magna id ligula gravida sodales. Ut blandit justo eu risus volutpat tristique. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Cras eu egestas odio. Donec a finibus justo, nec convallis eros. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. "))
        list19.add(Model19("Heading2","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam dictum orci vel elit iaculis laoreet. Duis et tincidunt urna, id tincidunt sapien. Sed non magna id ligula gravida sodales. Ut blandit justo eu risus volutpat tristique. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Cras eu egestas odio. Donec a finibus justo, nec convallis eros. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. "))
        list19.add(Model19("Heading3","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam dictum orci vel elit iaculis laoreet. Duis et tincidunt urna, id tincidunt sapien. Sed non magna id ligula gravida sodales. Ut blandit justo eu risus volutpat tristique. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Cras eu egestas odio. Donec a finibus justo, nec convallis eros. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. "))
        list19.add(Model19("Heading4","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam dictum orci vel elit iaculis laoreet. Duis et tincidunt urna, id tincidunt sapien. Sed non magna id ligula gravida sodales. Ut blandit justo eu risus volutpat tristique. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Cras eu egestas odio. Donec a finibus justo, nec convallis eros. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. "))


        rv.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rv.adapter = Adapter19(list19)
        rv.addItemDecoration(RvDecorationLinear((resources.displayMetrics.density*16).roundToInt(),(resources.displayMetrics.density*16).roundToInt()))

    }
}