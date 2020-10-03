package com.example.sampleui2.ui.other.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.widget.SwitchCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.ui.other.model.CarPreferencesModel
import com.example.sampleui2.R

class CarPreferencesAdapter(var list:List<CarPreferencesModel>): RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        when(viewType) {
            0 -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.other_rv_item_normaltile, parent, false)
                return Viewholder0(view)
            }
            1 -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.other_rv_item_spinnertile, parent, false)
                return Viewholder1(view)
            }
            else -> {
                val view = LayoutInflater.from(parent.context).inflate(R.layout.other_rv_item_normaltile, parent, false)
                return Viewholder0(view)
            }
        }

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(getItemViewType(position)){
            0->(holder as Viewholder0).bindItems(list[position].heading,list[position].subHeading)
            1->{(holder as Viewholder1).bindItems(list[position].heading)
                holder.switch.setOnCheckedChangeListener { _, isChecked ->
                    holder.subtitle.text = when(isChecked){true->"Yes" false->"No"}
                }
            }
        }

    }

    class Viewholder0(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val subtitle: TextView = itemView.findViewById(R.id.Normalsubtitle)
        private val title: TextView = itemView.findViewById(R.id.normaltitle)
        fun bindItems(title:String,subtitle:String) {
            this.title.text=title
            this.subtitle.text=subtitle
        }
    }

    class Viewholder1(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val switch: SwitchCompat = itemView.findViewById(R.id.switch1)
         val title: TextView = itemView.findViewById(R.id.spinnertitle)
         val subtitle: TextView = itemView.findViewById(R.id.spinner_boolean)
        fun bindItems(title:String) {
            this.title.text = title
            subtitle.text = when(switch.isActivated){true->"Yes" false->"No"}
        }
    }

    override fun getItemViewType(position: Int): Int {
        return list[position].itemType
    }

}