package com.example.sampleui2.ui.home.profile.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.ui.home.profile.model.PrivacyPolicyModel
import com.example.sampleui2.R

class PrivacyPolicyAdapter(var listPrivacyPolicy:List<PrivacyPolicyModel>):RecyclerView.Adapter<PrivacyPolicyAdapter.viewholder>() {
    class viewholder(itemView:View) : RecyclerView.ViewHolder(itemView){
        var tvheading : TextView = itemView.findViewById(R.id.RVItemHeading_page19)
        var tvcontent : TextView = itemView.findViewById(R.id.RVItemContent_page19)

        fun bindItems(heading:String,content:String){
            tvheading.text = heading
            tvcontent.text = content
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.profile_settings_privacypolicy_rv_item,parent,false)
        return viewholder(view)
    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        holder.bindItems(listPrivacyPolicy[position].heading,listPrivacyPolicy[position].content)
    }

    override fun getItemCount(): Int {
        return listPrivacyPolicy.size
    }
}