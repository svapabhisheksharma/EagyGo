package com.example.sampleui2.Page50

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.R

class Adapter50(var list:List<Model50>):RecyclerView.Adapter<Adapter50.VH>() {
    class VH(itemView:View):RecyclerView.ViewHolder(itemView) {
        val image :ImageView = itemView.findViewById(R.id.page50_image)
        fun bindItems(resource:Int){
            image.setImageResource(resource)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.rvitem_page50,parent,false)
        return VH(view)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.bindItems(list[position].imgresource)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}