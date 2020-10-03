package com.example.sampleui2.ui.home.profile.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.ui.home.profile.model.PerformanceModel
import com.example.sampleui2.R

class PerformanceAdapter(var list20Performance:List<PerformanceModel>):RecyclerView.Adapter<PerformanceAdapter.viewholder>() {
    class viewholder(itemView:View) : RecyclerView.ViewHolder(itemView){


        fun bindItems(){
        }
    }

    override fun getItemViewType(position: Int): Int {
        return list20Performance[position].type
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
       when(viewType) {
           0->{   val view = LayoutInflater.from(parent.context).inflate(R.layout.profile_settings_performance_rv_item_1, parent, false)
           return viewholder(view)
           }
           1->{   val view = LayoutInflater.from(parent.context).inflate(R.layout.profile_settings_performance_rv_item_2, parent, false)
               return viewholder(view)
           }
           else->{   val view = LayoutInflater.from(parent.context).inflate(R.layout.profile_settings_performance_rv_item_1, parent, false)
               return viewholder(view)
           }
       }
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        holder.bindItems()
    }

    override fun getItemCount(): Int {
        return list20Performance.size
    }
}