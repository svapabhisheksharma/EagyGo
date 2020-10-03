package com.example.sampleui2.ui.other.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.ui.other.model.MyCarsModel
import com.example.sampleui2.R

class MyCarsAdapter(var list: List<MyCarsModel>):RecyclerView.Adapter<MyCarsAdapter.ViewHolder>() {
    class ViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        private var tvcarname : TextView = itemView.findViewById(R.id.page48_carname)
        private var tvcarno : TextView = itemView.findViewById(R.id.page48_carno)
        private var tvcarstatus: TextView = itemView.findViewById(R.id.page48_carstatus)
        private var img : ImageView = itemView.findViewById(R.id.page48_image)
        fun bindItems(carname:String,carno:String,carstatus:Boolean,resource:Int){
            tvcarname.text = carname
            tvcarno.text = carno
            tvcarstatus.text = if (carstatus) "Online" else "Offline"
            tvcarstatus.setTextColor(if (carstatus) Color.parseColor("#00cf00") else Color.parseColor("#a4a9ae"))
            img.setImageResource(resource)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.other_mycars_rv_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(list[position].carname,list[position].carno,list[position].carstatus,list[position].imageresource)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}