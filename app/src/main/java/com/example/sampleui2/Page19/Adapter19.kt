package com.example.sampleui2.Page19

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.R

class Adapter19(var list19:List<Model19>):RecyclerView.Adapter<Adapter19.viewholder>() {
    class viewholder(itemView:View) : RecyclerView.ViewHolder(itemView){
        var tvheading : TextView = itemView.findViewById(R.id.RVItemHeading_page19)
        var tvcontent : TextView = itemView.findViewById(R.id.RVItemContent_page19)

        fun bindItems(heading:String,content:String){
            tvheading.text = heading
            tvcontent.text = content
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.rvitem_page19,parent,false)
        return viewholder(view)
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        holder.bindItems(list19[position].heading,list19[position].content)
    }

    override fun getItemCount(): Int {
        return list19.size
    }
}