package com.example.sampleui2.ui.other.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.ui.other.model.CarDamagesModel
import com.example.sampleui2.R

class CarDamagesAdapter(var list:List<CarDamagesModel>):RecyclerView.Adapter<CarDamagesAdapter.VH>() {
    class VH(itemView:View):RecyclerView.ViewHolder(itemView) {
        val image :ImageView = itemView.findViewById(R.id.img_car)
        fun bindItems(resource:Int){
            image.setImageResource(resource)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.other_cardamages_rv_item,parent,false)
        return VH(view)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bindItems(list[position].imgresource)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}