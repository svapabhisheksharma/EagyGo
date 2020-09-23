package com.example.sampleui2.Page8910

import android.content.Intent
import android.graphics.Color
import android.graphics.Outline
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewOutlineProvider
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.Page1314.Modelfrag13
import com.example.sampleui2.Page40.Modelfrag40
import com.example.sampleui2.Page41.Page41
import com.example.sampleui2.R
import kotlin.coroutines.coroutineContext

class AdapterFrag40(var list: List<Modelfrag40>):RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view  = LayoutInflater.from(parent.context).inflate(R.layout.item_frag40,parent,false)
        return Viewholder(view)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as Viewholder).bindItems(list[position].name,list[position].resource)
        holder.itemView.setOnClickListener {
            val intent = Intent(list[position].activity,Page41::class.java)
            val bundle = Bundle()
            intent.putExtra("name",list[position].name)
            intent.putExtra("resource",list[position].resource)
            startActivity(holder.itemView.context,intent,bundle)
        }
    }

    class Viewholder(itemView:View) : RecyclerView.ViewHolder(itemView) {

        private val name : TextView = itemView.findViewById(R.id.name_frag40)
        private val imageView:ImageView = itemView.findViewById(R.id.imagefrag40)
        fun bindItems(name:String,resource:Int) {
            imageView.setImageResource(resource)
            this.name.text = name

        }
    }

}