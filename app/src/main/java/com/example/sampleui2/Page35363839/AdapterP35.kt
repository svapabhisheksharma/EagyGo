package com.example.sampleui2.Page35363839

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.sampleui2.ImageSlider.SliderAdapter
import com.example.sampleui2.R

class AdapterP35(val list:List<Modelp35>,val pageType:Int):RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun getItemViewType(position: Int): Int {
        return list[position].itemtype
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when(viewType){
            0-> VHslider(LayoutInflater.from(parent.context).inflate(R.layout.imageslider,parent,false))
            1-> VHSimple(LayoutInflater.from(parent.context).inflate(R.layout.p35aboutitem,parent,false))
            2-> VHText(LayoutInflater.from(parent.context).inflate(R.layout.p35text,parent,false))
            3-> VHSimple(LayoutInflater.from(parent.context).inflate(R.layout.p35photoid,parent,false))
            else-> VHslider(LayoutInflater.from(parent.context).inflate(R.layout.imageslider,parent,false))
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(getItemViewType(position)){
            0->(holder as VHslider).bindItems()
            2->(holder as VHText).bindItems(pageType)
            else->(holder as VHSimple).bindItems()
        }
    }

    override fun getItemCount(): Int {
        return list.size
    }

    class VHslider(view: View):RecyclerView.ViewHolder(view){
        private  val viewpager : ViewPager2 = view.findViewById(R.id.imagesliderviewpager2)
        private val list = listOf(
                R.drawable.main_banner, R.drawable.main_banner, R.drawable.main_banner, R.drawable.main_banner, R.drawable.main_banner, R.drawable.main_banner, R.drawable.main_banner)
        fun bindItems(){
            viewpager.adapter = SliderAdapter(list)
        }
    }

    class VHSimple(view: View):RecyclerView.ViewHolder(view){
        fun bindItems(){

        }
    }
    class VHText(view: View):RecyclerView.ViewHolder(view){
        private val textleft:TextView=view.findViewById(R.id.lefttext)
        private val textright:TextView=view.findViewById(R.id.righttext)
        private val textmiddle:TextView=view.findViewById(R.id.middletext)
        fun bindItems(pagetype:Int){
            when(pagetype){
                0->{
                    textleft.text = "Booked by\n" +
                            "Booking Date & Time\n" +
                            "Contact Number\n" +
                            "Car Driving Options\n" +
                            "Booked on"
                    textmiddle.text=":\n" +
                            ":\n" +
                            ":\n" +
                            ":\n" +
                            ":"
                    textright.text="Alok Kumar Yadav\n" +
                            "21-06-2020, 10:00 AM\n" +
                            "+91-1234567890\n" +
                            "Self\n" +
                            "21-05-2020, 10:00 AM"
                }
                1->{
                    textleft.text = "Booked by\n" +
                            "Booking Date & Time\n" +
                            "Contact Number\n" +
                            "Car Driving Options\n" +
                            "Booked on\n" +
                            "Cancelled On"
                    textmiddle.text=":\n" +
                            ":\n" +
                            ":\n" +
                            ":\n" +
                            ":\n" +
                            ":"
                    textright.text="Alok Kumar Yadav\n" +
                            "21-06-2020, 10:00 AM\n" +
                            "+91-1234567890\n" +
                            "Self\n" +
                            "21-05-2020, 10:00 AM\n" +
                            "22-05-2020, 10:00 AM"
                }
                2->{
                    textleft.text = "Booked by\n" +
                            "Booking Date & Time\n" +
                            "Contact Number\n" +
                            "Car Driving Options\n" +
                            "Booked on\n" +
                            "Amount Paid"
                    textmiddle.text=":\n" +
                            ":\n" +
                            ":\n" +
                            ":\n" +
                            ":\n" +
                            ":"
                    textright.text="Alok Kumar Yadav\n" +
                            "21-06-2020, 10:00 AM\n" +
                            "+91-1234567890\n" +
                            "Self\n" +
                            "21-05-2020, 10:00 AM\n" +
                            "10,000"
                }
                3->{
                    textleft.text = "Booked by\n" +
                            "Booking Date & Time\n" +
                            "Contact Number\n" +
                            "Car Driving Options\n" +
                            "Booked on\n" +
                            "Payment Status"
                    textmiddle.text=":\n" +
                            ":\n" +
                            ":\n" +
                            ":\n" +
                            ":\n" +
                            ":"
                    textright.text="Alok Kumar Yadav\n" +
                            "21-06-2020, 10:00 AM\n" +
                            "+91-1234567890\n" +
                            "Self\n" +
                            "21-05-2020, 10:00 AM\n" +
                            "Not Done/Paid"
                }
                4->{
                    textleft.text = "Booked by\n" +
                            "Booking Date & Time\n" +
                            "Contact Number\n" +
                            "Car Driving Options\n" +
                            "Booked on\n" +
                            "Cancelled On"
                    textmiddle.text=":\n" +
                            ":\n" +
                            ":\n" +
                            ":\n" +
                            ":\n" +
                            ":"
                    textright.text="Alok Kumar Yadav\n" +
                            "21-06-2020, 10:00 AM\n" +
                            "+91-1234567890\n" +
                            "Self\n" +
                            "21-05-2020, 10:00 AM\n" +
                            "22-05-2020, 10:00 AM"
                }
                5->{
                    textleft.text = "Booking Date & Time\n" +
                            "Booked on\n" +
                            "Amount Paid\n" +
                            "Owner Name\n" +
                            "Owner Contact"
                    textmiddle.text=":\n" +
                            ":\n" +
                            ":\n" +
                            ":\n" +
                            ":"
                    textright.text="21-06-2020, 10:00 AM\n" +
                            "21-05-2020, 10:00 AM\n" +
                            "10,000\n" +
                            "Owner Name\n" +
                            "+91-1234567890\n"
                }
                6->{
                    textleft.text = "Owner Name\n" +
                            "Booking Date & Time\n" +
                            "Contact Number\n" +
                            "Car Driving Options\n" +
                            "Booked on"
                    textmiddle.text=":\n" +
                            ":\n" +
                            ":\n" +
                            ":\n" +
                            ":"
                    textright.text="Alok Kumar Yadav\n" +
                            "21-06-2020, 10:00 AM\n" +
                            "+91-1234567890\n" +
                            "Self\n" +
                            "21-05-2020, 10:00 AM"
                }
            }
        }
    }
}