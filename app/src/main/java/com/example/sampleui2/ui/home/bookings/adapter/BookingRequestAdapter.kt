package com.example.sampleui2.ui.home.bookings.adapter

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.ui.home.bookings.model.BookingRequestModel
import com.example.sampleui2.ui.home.bookings.activity.BookingTile
import com.example.sampleui2.R

class BookingRequestAdapter(var list: List<BookingRequestModel>, val activity:FragmentActivity?):RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view  = LayoutInflater.from(parent.context).inflate(R.layout.booking_tab_bookingrequest_rv_item,parent,false)
        return Viewholder(view)

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as Viewholder).bindItems(list[position].resource,list[position].name,list[position].status)
        val pageType :Int = when(list[position].status){
            0->6
            2->5
            3->3
            4->4
            else->0
        }
        if(list[position].status!=1){
            holder.itemView.setOnClickListener {
                val intent = Intent(activity, BookingTile::class.java)
                intent.putExtra("pageType",pageType)
                ContextCompat.startActivity(holder.itemView.context, intent, Bundle.EMPTY)
            }}
    }

    class Viewholder(itemView:View) : RecyclerView.ViewHolder(itemView) {
        private val image: ImageView = itemView.findViewById(R.id.imagefrag13)
        private val name : TextView = itemView.findViewById(R.id.namefrag13)
        private val button :Button = itemView.findViewById(R.id.buttonfrag13)
        private  val status: TextView =itemView.findViewById(R.id.statusfrag13)
        private val statuscircle : ConstraintLayout = itemView.findViewById(R.id.statuscirclefrag13)
        fun bindItems(resource:Int,name:String,status:Int) {
            image.setImageResource(resource)
            this.name.text = name
            this.status.text = when(status){
                0->"PENDING"
                1->"ONGOING"
                2->"COMPLETED"
                3->"UPCOMING"
                4->"CANCELLED"
                else->"PENDING"
            }
            this.status.setTextColor(
                    when(status){
                        0->Color.parseColor("#ff1414")
                        1->Color.parseColor("#e58b00")
                        2->Color.parseColor("#00cf00")
                        3->Color.parseColor("#7441f5")
                        4->Color.parseColor("#00cf00")
                        else->Color.parseColor("#ff1414")
                    }
            )
            statuscircle.setBackgroundResource(when(status){
                0->R.drawable.pending_status
                1->R.drawable.ongoing_status
                2->R.drawable.completed_status
                3->R.drawable.upcoming_status
                4->R.drawable.completed_status
                else->R.drawable.upcoming_status
            })
            button.visibility = when(status){
                0->View.GONE
                1->View.GONE
                2->View.VISIBLE
                3->View.GONE
                4->View.GONE
                else->View.GONE
            }
        }
    }

}