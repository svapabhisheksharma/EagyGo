package com.example.sampleui2.Page8910

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.ui.home.message.model.MessageModel
import com.example.sampleui2.ui.home.message.activity.Chat
import com.example.sampleui2.R

class AdapterFrag40(var list: List<MessageModel>):RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view  = LayoutInflater.from(parent.context).inflate(R.layout.message_rv_item,parent,false)
        return Viewholder(view)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as Viewholder).bindItems(list[position].name,list[position].resource)
        holder.itemView.setOnClickListener {
            val intent = Intent(list[position].activity, Chat::class.java)
            val bundle = Bundle()
            intent.putExtra("name",list[position].name)
            intent.putExtra("resource",list[position].resource)
            startActivity(holder.itemView.context,intent,bundle)
        }
    }

    class Viewholder(itemView:View) : RecyclerView.ViewHolder(itemView) {

        private val name : TextView = itemView.findViewById(R.id.txt_name)
        private val imageView:ImageView = itemView.findViewById(R.id.img_person)
        fun bindItems(name:String,resource:Int) {
            imageView.setImageResource(resource)
            this.name.text = name

        }
    }

}