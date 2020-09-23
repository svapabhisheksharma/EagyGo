package com.example.sampleui2.Page1314

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

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