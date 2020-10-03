package com.example.sampleui2.ui.home.profile.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.ui.home.profile.model.SettingsModel
import com.example.sampleui2.R

class SettingsAdapter(val list: List<SettingsModel>, val itemClickHandler:(Int)->Unit) : RecyclerView.Adapter<SettingsAdapter.ViewHolder>() {
    class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView) {

        private val img : ImageView = itemView.findViewById(R.id.imgp18)
        private val title : TextView = itemView.findViewById(R.id.titlep18)
        fun bindItems(resoucevalue : Int , titlevalue:String){
            img.setImageResource(resoucevalue)
            title.text =titlevalue
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.profile_settings_rv_item,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(list[position].imgresource,list[position].title)
        holder.itemView.setOnClickListener {
            itemClickHandler.invoke(position)
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }
}