package com.example.sampleui2.ImageSlider

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.R

class SliderAdapter(val list : List<Int>):RecyclerView.Adapter<SliderAdapter.SliderViewHolder>(){
    class SliderViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id.image_imageSlider)
        fun bindItems(resource:Int){
            imageView.setImageResource(resource)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SliderViewHolder {
        return SliderViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.image,parent,false)
        )
    }

    override fun onBindViewHolder(holder: SliderViewHolder, position: Int) {
        holder.bindItems(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

}