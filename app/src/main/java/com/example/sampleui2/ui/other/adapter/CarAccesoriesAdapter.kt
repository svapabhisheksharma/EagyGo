package com.example.sampleui2.ui.other.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.SwitchCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.R

class CarAccesoriesAdapter(var totalCards:Int):RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view  = LayoutInflater.from(parent.context).inflate(R.layout.other_rv_item_spinnertile,parent,false)
        return Viewholder(view)

    }

    override fun getItemCount(): Int {
        return totalCards
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as Viewholder).bindItems()
        holder.switch.setOnCheckedChangeListener { _, isChecked ->
            holder.textView.text = when(isChecked){true->"Available" false->"Not Available"}
         }
    }

    class Viewholder(itemView:View) : RecyclerView.ViewHolder(itemView) {
         val textView: TextView = itemView.findViewById(R.id.spinner_boolean)
         val switch:SwitchCompat = itemView.findViewById(R.id.switch1)
        fun bindItems() {
            textView.text = when(switch.isActivated){true->"Available" false->"Not Available"}
        }
    }

}