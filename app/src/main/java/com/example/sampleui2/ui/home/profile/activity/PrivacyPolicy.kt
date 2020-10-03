package com.example.sampleui2.ui.home.profile.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.ui.home.profile.adapter.PrivacyPolicyAdapter
import com.example.sampleui2.ui.home.profile.model.PrivacyPolicyModel
import com.example.sampleui2.R
import com.example.sampleui2.RvDecorationLinear
import kotlin.math.roundToInt

class PrivacyPolicy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_settings_privacypolicy_activity)

        var rv : RecyclerView = findViewById(R.id.recyclerview)

        var list19 = ArrayList<PrivacyPolicyModel>()

        list19.add(PrivacyPolicyModel("Heading1","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam dictum orci vel elit iaculis laoreet. Duis et tincidunt urna, id tincidunt sapien. Sed non magna id ligula gravida sodales. Ut blandit justo eu risus volutpat tristique. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Cras eu egestas odio. Donec a finibus justo, nec convallis eros. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. "))
        list19.add(PrivacyPolicyModel("Heading2","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam dictum orci vel elit iaculis laoreet. Duis et tincidunt urna, id tincidunt sapien. Sed non magna id ligula gravida sodales. Ut blandit justo eu risus volutpat tristique. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Cras eu egestas odio. Donec a finibus justo, nec convallis eros. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. "))
        list19.add(PrivacyPolicyModel("Heading3","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam dictum orci vel elit iaculis laoreet. Duis et tincidunt urna, id tincidunt sapien. Sed non magna id ligula gravida sodales. Ut blandit justo eu risus volutpat tristique. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Cras eu egestas odio. Donec a finibus justo, nec convallis eros. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. "))
        list19.add(PrivacyPolicyModel("Heading4","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam dictum orci vel elit iaculis laoreet. Duis et tincidunt urna, id tincidunt sapien. Sed non magna id ligula gravida sodales. Ut blandit justo eu risus volutpat tristique. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Cras eu egestas odio. Donec a finibus justo, nec convallis eros. Orci varius natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. "))


        rv.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        rv.adapter = PrivacyPolicyAdapter(list19)
        rv.addItemDecoration(RvDecorationLinear((resources.displayMetrics.density*16).roundToInt(),(resources.displayMetrics.density*16).roundToInt()))
        findViewById<ImageView>(R.id.img_back).setOnClickListener {
            finish()
        }

    }
}