package com.example.sampleui2.Page1314

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.Page8910.AdapterFrag13
import com.example.sampleui2.Page8910.AdapterFrag14
import com.example.sampleui2.R
import com.example.sampleui2.RvDecorationLinear
import kotlin.math.roundToInt

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Page14Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Page14Fragment : Fragment() {
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

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_page14, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?){

        val rv = view.findViewById<RecyclerView>(R.id.rvfrag14)
        val list = listOf<Modelfrag13>(
                Modelfrag13("Mini Cooper",R.drawable.mini_png_11772,0),
                Modelfrag13("Fortuner",R.drawable.toyota_fortuner_png_8,1),
                Modelfrag13("Mini Cooper",R.drawable.mini_png_11772,2),
                Modelfrag13("Fortuner",R.drawable.toyota_fortuner_png_8,3),
                Modelfrag13("Mini Cooper",R.drawable.mini_png_11772,0),
                Modelfrag13("Mini Cooper",R.drawable.mini_png_11772,1),
                Modelfrag13("Fortuner",R.drawable.toyota_fortuner_png_8,2),
                Modelfrag13("Fortuner",R.drawable.toyota_fortuner_png_8,3),
                Modelfrag13("Mini Cooper",R.drawable.mini_png_11772,1),
                Modelfrag13("Mini Cooper",R.drawable.mini_png_11772,2)
        )
        rv.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        rv.adapter = AdapterFrag14(list)
        rv.addItemDecoration(RvDecorationLinear(
                (resources.displayMetrics.density * 18).roundToInt(),
                (resources.displayMetrics.density * 20).roundToInt()
        ))


    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Page14Fragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
                Page14Fragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }
}