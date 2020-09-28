package com.example.sampleui2.Page43

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.sampleui2.ImageSlider.SliderAdapter
import com.example.sampleui2.R

class Adapter43(val list:List<Model43>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemViewType(position: Int): Int {
        return list[position].type
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            0 -> VHslider(LayoutInflater.from(parent.context).inflate(R.layout.imageslider, parent, false))
            1 -> VHSimple(LayoutInflater.from(parent.context).inflate(R.layout.p35aboutitem, parent, false))
            2 -> VHSimple(LayoutInflater.from(parent.context).inflate(R.layout.rate_item, parent, false))
            else -> VHslider(LayoutInflater.from(parent.context).inflate(R.layout.imageslider, parent, false))
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (getItemViewType(position)) {
            0 -> (holder as VHslider).bindItems()
            else -> (holder as VHSimple).bindItems()
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class VHslider(view: View) : RecyclerView.ViewHolder(view) {
        private val viewpager: ViewPager2 = view.findViewById(R.id.imagesliderviewpager2)
        private val list = listOf(
                R.drawable.main_banner, R.drawable.main_banner, R.drawable.main_banner, R.drawable.main_banner, R.drawable.main_banner, R.drawable.main_banner, R.drawable.main_banner)

        fun bindItems() {
            viewpager.adapter = SliderAdapter(list)
        }
    }

    class VHSimple(view: View) : RecyclerView.ViewHolder(view) {
        fun bindItems() {

        }
    }
}