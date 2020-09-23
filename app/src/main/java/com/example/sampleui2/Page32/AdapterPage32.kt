package com.example.sampleui2.Page32

import android.graphics.Color
import android.graphics.ColorFilter
import android.opengl.Visibility
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.R

class AdapterPage32(private val list: List<ModelPage32>) : RecyclerView.Adapter<AdapterPage32.ViewHolder>() {
    class ViewHolder(itemView:View) :RecyclerView.ViewHolder(itemView){
        private val img : ImageView = itemView.findViewById(R.id.imgp32)
        private val review :TextView = itemView.findViewById(R.id.reviewp32)
        private val date : TextView = itemView.findViewById(R.id.datep32)
        private val name :TextView = itemView.findViewById(R.id.namep32)

        fun bindItems(imgresource:Int,nameValue:String,dateValue:String,reviewValue: String){
            if (reviewValue.isEmpty() || reviewValue.isBlank())
                review.visibility = View.GONE
            else
                review.text = reviewValue

            img.setImageResource(imgresource)
            img.setColorFilter(Color.BLACK)
            date.text = dateValue
            name.text = dateValue
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_page_32,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItems(list[position].imgresource,list[position].name,list[position].date,list[position].review)
    }

    override fun getItemCount(): Int {
        return  list.size
    }
}