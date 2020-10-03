package com.example.sampleui2.ui.home.bookings.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.sampleui2.ui.home.bookings.fragment.Page13Fragment
import com.example.sampleui2.ui.home.bookings.fragment.Page14Fragment

class TabFragmentAdapter(private val fragment: Fragment ) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position){
            0-> Page14Fragment()

            1-> Page13Fragment()

            else -> Page14Fragment()
        }
    }

}