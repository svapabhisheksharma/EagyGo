package com.example.sampleui2.ui.home.message.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.ui.home.message.model.ChatModel
import com.example.sampleui2.R

class ChatAdapter(val list: List<ChatModel>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun getItemViewType(position: Int): Int {
        return when(list[position].type){
            0->0
            1->1
            else->0
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType){
            0-> sentVH(LayoutInflater.from(parent.context).inflate(R.layout.message_chat_sender_rv_item,parent,false))
            1-> recievedVH(LayoutInflater.from(parent.context).inflate(R.layout.message_chat_reciever_rv_item,parent,false))
            else-> sentVH(LayoutInflater.from(parent.context).inflate(R.layout.message_chat_sender_rv_item,parent,false))
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(getItemViewType(position)){
            0->(holder as sentVH).bindItems(list[position].message,list[position].time)
            1->(holder as recievedVH).bindItems(list[position].message,list[position].time)
        }
    }

    override fun getItemCount(): Int {
        return  list.size
    }

    class sentVH(itemView: View):RecyclerView.ViewHolder(itemView){
        private val text:TextView = itemView.findViewById(R.id.txt_sent)
        private val time:TextView = itemView.findViewById(R.id.txt_time)
        fun bindItems(text:String,time:String){
            this.text.text=text
            this.time.text=time
        }
    }

    class recievedVH(itemView: View):RecyclerView.ViewHolder(itemView){
        private val text:TextView = itemView.findViewById(R.id.txt_recieved)
        private val time:TextView = itemView.findViewById(R.id.txt_time)
        fun bindItems(text:String,time:String){
            this.text.text=text
            this.time.text=time
        }
    }


}