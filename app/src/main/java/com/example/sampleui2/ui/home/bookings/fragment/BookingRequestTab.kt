package com.example.sampleui2.ui.home.bookings.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.ui.home.bookings.adapter.BookingRequestAdapter
import com.example.sampleui2.R
import com.example.sampleui2.RvDecorationLinear
import com.example.sampleui2.ui.home.bookings.model.BookingRequestModel
import kotlin.math.roundToInt

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Page13Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Page13Fragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?){

        val rv = view.findViewById<RecyclerView>(R.id.recyclerview)
        val list = listOf<BookingRequestModel>(
                BookingRequestModel("Mini Cooper",R.drawable.mini_png_11772,0),
                BookingRequestModel("Fortuner",R.drawable.toyota_fortuner_png_8,1),
                BookingRequestModel("Mini Cooper",R.drawable.mini_png_11772,4),
                BookingRequestModel("Fortuner",R.drawable.toyota_fortuner_png_8,3),
                BookingRequestModel("Mini Cooper",R.drawable.mini_png_11772,0),
                BookingRequestModel("Mini Cooper",R.drawable.mini_png_11772,1),
                BookingRequestModel("Fortuner",R.drawable.toyota_fortuner_png_8,2),
                BookingRequestModel("Fortuner",R.drawable.toyota_fortuner_png_8,4),
                BookingRequestModel("Mini Cooper",R.drawable.mini_png_11772,1),
                BookingRequestModel("Mini Cooper",R.drawable.mini_png_11772,2)
        )
        rv.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        rv.adapter = BookingRequestAdapter(list,activity)
        rv.addItemDecoration(RvDecorationLinear(
                (resources.displayMetrics.density * 18).roundToInt(),
                (resources.displayMetrics.density * 20).roundToInt()
        ))


    }



    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.booking_fragment_tab_booking_request, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Page13Fragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
                Page13Fragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }
}