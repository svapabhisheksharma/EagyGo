package com.example.sampleui2.ui.home.home.adapter

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.sampleui2.ui.other.adapter.SliderAdapter
import com.example.sampleui2.ui.home.home.model.HomeTileModel
import com.example.sampleui2.ui.other.activity.Reviews
import com.example.sampleui2.R

class HomeTileAdapter(val list:List<HomeTileModel>, val context: Context):RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when(viewType){
            0->{
                val v = LayoutInflater.from(parent.context).inflate(R.layout.other_imageslider,parent,false)
                return VHslider(v)
            }
            1->{
                val v = LayoutInflater.from(parent.context).inflate(R.layout.home_favourite_tile_rv_item_about,parent,false)
                return VHSimple(v)
            }
            2->{
                val v = LayoutInflater.from(parent.context).inflate(R.layout.home_favourite_tile_rv_item_rules,parent,false)
                return VHSimple(v)
            }
            3->{
                val v = LayoutInflater.from(parent.context).inflate(R.layout.home_favourite_tile_rv_item_map,parent,false)
                return VHSimple(v)
            }
            4->{
                val v = LayoutInflater.from(parent.context).inflate(R.layout.home_favourite_tile_rv_item_aboutowner,parent,false)
                return VHSimple(v)
            }
            5->{
                val v = LayoutInflater.from(parent.context).inflate(R.layout.home_favourite_tile_rv_item_reviews,parent,false)
                return VHReviews(v)
            }
            6->{
                val v = LayoutInflater.from(parent.context).inflate(R.layout.home_favourite_tile_rv_item_book,parent,false)
                return VHSimple(v)
            }
            else->{
                val v = LayoutInflater.from(parent.context).inflate(R.layout.home_favourite_tile_rv_item_about,parent,false)
                return VHSimple(v)
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when {
            getItemViewType(position)==0 -> (holder as VHslider).bindItems()
            getItemViewType(position)==5 -> (holder as VHReviews).bindItems(context)
            else -> (holder as VHSimple).bindItems()
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun getItemViewType(position: Int): Int {
        return when(list[position].type){
            0->0
            1->1
            2->2
            3->3
            5->5
            4->4
            6->6
            else->1
        }
    }

    class VHslider(view:View):RecyclerView.ViewHolder(view){
        private  val viewpager : ViewPager2 = view.findViewById(R.id.imagesliderviewpager2)
        private val list = listOf(
                R.drawable.main_banner,R.drawable.main_banner,R.drawable.main_banner,R.drawable.main_banner,R.drawable.main_banner,R.drawable.main_banner,R.drawable.main_banner)
        fun bindItems(){
            viewpager.adapter = SliderAdapter(list)
        }
    }

    class VHSimple(view:View):RecyclerView.ViewHolder(view){
        fun bindItems(){

        }
    }
    class VHReviews(view:View):RecyclerView.ViewHolder(view){
        private val image = view.findViewById<ImageView>(R.id.gotoreviews)
        fun bindItems(context:Context){
            image.setOnClickListener {
                val intent= Intent(context, Reviews::class.java)
                startActivity(itemView.context,intent, Bundle.EMPTY)
            }
        }
    }

}