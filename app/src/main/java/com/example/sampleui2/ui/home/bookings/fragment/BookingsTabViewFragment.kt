package com.example.sampleui2.ui.home.bookings.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.sampleui2.R
import com.example.sampleui2.ui.home.bookings.adapter.TabFragmentAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Page1314fragment.newInstance] factory method to
 * create an instance of this fragment.
 */




class Page1314fragment : Fragment() {
    // TODO: Rename and change types of parameters

    private lateinit var tabFragmentAdapter: TabFragmentAdapter
    private lateinit var viewPager2: ViewPager2


    private var param1: String? = null
    private var param2: String? = null


    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        tabFragmentAdapter = TabFragmentAdapter(this)
        viewPager2 = view.findViewById(R.id.viewPager2)
        viewPager2.adapter = tabFragmentAdapter


        val tabLayout : TabLayout = view.findViewById(R.id.tabLayout)
        tabLayout.tabRippleColor = null
        TabLayoutMediator(tabLayout, viewPager2,
                TabLayoutMediator.TabConfigurationStrategy { tab, position ->
                    when (position) {
                        0 -> {
                            tab.text = "Booking Request"
                        }
                        1 -> {
                            tab.text = "My Bookings"
                        }
                    }
                }).attach()


    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.booking_fragment_tabview, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Page1314fragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
                Page1314fragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }
}