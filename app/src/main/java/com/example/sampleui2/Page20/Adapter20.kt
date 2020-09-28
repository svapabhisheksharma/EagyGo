package com.example.sampleui2.Page20

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.Page19.Model19
import com.example.sampleui2.R

class Adapter20(var list20:List<ModelPage20>):RecyclerView.Adapter<Adapter20.viewholder>() {
    class viewholder(itemView:View) : RecyclerView.ViewHolder(itemView){


        fun bindItems(){
        }
    }

    override fun getItemViewType(position: Int): Int {
        return list20[position].type
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
       when(viewType) {
           0->{   val view = LayoutInflater.from(parent.context).inflate(R.layout.page20_item1, parent, false)
           return viewholder(view)}
           1->{   val view = LayoutInflater.from(parent.context).inflate(R.layout.page20_item2, parent, false)
               return viewholder(view)}
           else->{   val view = LayoutInflater.from(parent.context).inflate(R.layout.page20_item1, parent, false)
               return viewholder(view)}
       }
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        holder.bindItems()
    }

    override fun getItemCount(): Int {
        return list20.size
    }
}