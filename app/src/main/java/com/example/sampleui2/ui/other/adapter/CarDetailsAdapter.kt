package com.example.sampleui2.ui.other.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.R

class CarDetailsAdapter(var totalCards:Int): RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view  = LayoutInflater.from(parent.context).inflate(R.layout.other_rv_item_normaltile,parent,false)
        return Viewholder(view)

    }

    override fun getItemCount(): Int {
        return totalCards
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as Viewholder).bindItems(position)
    }

    class Viewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val image: ImageView = itemView.findViewById(R.id.img_lock)
        fun bindItems(position: Int) {
            if (position==0)
                image.visibility = View.VISIBLE
        }
    }

}