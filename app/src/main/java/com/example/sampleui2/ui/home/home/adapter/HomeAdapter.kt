package com.example.sampleui2.ui.home.home.adapter

import android.content.Intent
import android.graphics.Outline
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewOutlineProvider
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat.startActivity
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.ui.home.home.activity.HomeTile
import com.example.sampleui2.R

class HomeAdapter(var totalCards:Int, val  activity:FragmentActivity?, val isfavourite:Boolean):RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view  = LayoutInflater.from(parent.context).inflate(R.layout.home_favourite_rv_item,parent,false)
        return Viewholder(view)

    }

    override fun getItemCount(): Int {
        return totalCards
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as Viewholder).bindItems(isfavourite,position)
        holder.itemView.setOnClickListener {
            val intent = Intent(activity, HomeTile::class.java)
            startActivity(holder.itemView.context,intent, Bundle.EMPTY)
        }
    }

    class Viewholder(itemView:View) : RecyclerView.ViewHolder(itemView) {
        private val image: ImageView = itemView.findViewById(R.id.imageView2)
        fun bindItems(isfav:Boolean,position:Int) {
            val star:ImageView = itemView.findViewById(R.id.fav)
            if(isfav)   star.visibility = View.VISIBLE

            if (position%2==0)
                image.setImageResource(R.drawable.unnamed)

            val curveRadius = 30F

            image.outlineProvider = object : ViewOutlineProvider() {

                @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
                override fun getOutline(view: View?, outline: Outline?) {
                    outline?.setRoundRect(0, 0, view!!.width, (view.height + curveRadius).toInt(), curveRadius)
                }
            }

            image.clipToOutline = true
        }
    }

}