package com.example.sampleui2.Page40

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.Page1314.Modelfrag13
import com.example.sampleui2.Page8910.AdapterFrag13
import com.example.sampleui2.Page8910.AdapterFrag40
import com.example.sampleui2.R
import com.example.sampleui2.RvDecorationLinear
import kotlin.math.roundToInt

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Page40Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Page40Fragment : Fragment() {
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

        val rv = view.findViewById<RecyclerView>(R.id.rvfrag40)
        val list = listOf<Modelfrag40>(
                Modelfrag40("Shane Martinez",R.drawable.ic_petrol,activity),
                Modelfrag40("Katie Keller",R.drawable.ic_gear,activity),
                Modelfrag40("Stephen Mann",R.drawable.ic_ciggarate,activity),
                Modelfrag40("Malvin Pratt",R.drawable.ic_pets,activity),
                Modelfrag40("Shane Martinez",R.drawable.ic_petrol,activity),
                Modelfrag40("Katie Keller",R.drawable.ic_gear,activity),
                Modelfrag40("Stephen Mann",R.drawable.ic_ciggarate,activity),
                Modelfrag40("Malvin Pratt",R.drawable.ic_pets,activity)
        )
        rv.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL,false)
        rv.adapter = AdapterFrag40(list)
        rv.addItemDecoration(RvDecorationLinear(
                (resources.displayMetrics.density * 18).roundToInt(),
                (resources.displayMetrics.density *24 ).roundToInt()
        ))


    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_page40, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Page40Fragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
                Page40Fragment().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }
}