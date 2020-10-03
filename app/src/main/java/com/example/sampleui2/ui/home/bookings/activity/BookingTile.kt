package com.example.sampleui2.ui.home.bookings.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.ui.home.bookings.adapter.BookingTileAdapter
import com.example.sampleui2.ui.home.bookings.model.BookingTileModel
import com.example.sampleui2.R

class BookingTile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.booking_tile_activity)

        val title : TextView = findViewById(R.id.p35title)
        val back : ImageView =findViewById(R.id.p35back)
        val rv : RecyclerView = findViewById(R.id.rvp35)
        val bottomLayout: ConstraintLayout = findViewById(R.id.bottomconstraintlayout)
        val cancelButton : Button = findViewById(R.id.cancelbuttonbottom)
        val approveButton : Button = findViewById(R.id.approvebuttonbottom)
        val chatUserButton :Button = findViewById(R.id.chatwuserbuttton)

        val pageType : Int= intent.extras?.get("pageType") as Int
        Log.d("pageType",pageType.toString())

        val lm = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        when(pageType){
            0->{
                val list= listOf(
                        BookingTileModel(0),
                        BookingTileModel(1),
                        BookingTileModel(2)
                )
                val a = BookingTileAdapter(list,pageType)
                rv.apply {
                    layoutManager = lm
                    adapter = a
                }
                title.text="Pending Request"
                cancelButton.visibility=View.VISIBLE
                approveButton.visibility = View.VISIBLE
            }
            1->{
                val list= listOf(
                        BookingTileModel(0),
                        BookingTileModel(1),
                        BookingTileModel(2)
                )
                val a = BookingTileAdapter(list,pageType)
                rv.apply {
                    layoutManager = lm
                    adapter = a
                }
                title.text="Cancelled"
                bottomLayout.visibility = View.GONE
            }
            2->{
                val list= listOf(
                        BookingTileModel(0),
                        BookingTileModel(1),
                        BookingTileModel(2),
                        BookingTileModel(3)
                )
                val a = BookingTileAdapter(list,pageType)
                rv.apply {
                    layoutManager = lm
                    adapter = a
                }
                title.text="Completed"
                chatUserButton.visibility = View.VISIBLE
                chatUserButton.text = "Chat with user"
            }
            3->{
                val list= listOf(
                        BookingTileModel(0),
                        BookingTileModel(1),
                        BookingTileModel(2),
                        BookingTileModel(3)
                )
                val a = BookingTileAdapter(list,pageType)
                rv.apply {
                    layoutManager = lm
                    adapter = a
                }
                title.text="Upcoming"
                chatUserButton.visibility = View.VISIBLE
                chatUserButton.text = "Chat with user"
            }
            4->{
                val list= listOf(
                        BookingTileModel(0),
                        BookingTileModel(1),
                        BookingTileModel(2)
                )
                val a = BookingTileAdapter(list,pageType)
                rv.apply {
                    layoutManager = lm
                    adapter = a
                }
                title.text="Cancelled"
                bottomLayout.visibility = View.GONE
            }
            5->{
                val list= listOf(
                        BookingTileModel(0),
                        BookingTileModel(1),
                        BookingTileModel(2)
                )
                val a = BookingTileAdapter(list,pageType)
                rv.apply {
                    layoutManager = lm
                    adapter = a
                }
                title.text="Completed"
                chatUserButton.visibility = View.VISIBLE
                chatUserButton.text = "Chat with owner"
            }
            6->{
                val list= listOf(
                        BookingTileModel(0),
                        BookingTileModel(1),
                        BookingTileModel(2)
                )
                val a = BookingTileAdapter(list,pageType)
                rv.apply {
                    layoutManager = lm
                    adapter = a
                }
                title.text="Pending Request"
                chatUserButton.visibility = View.VISIBLE
                chatUserButton.text = "Chat with owner"
            }
            else->{
                val list= listOf(
                        BookingTileModel(0),
                        BookingTileModel(1),
                        BookingTileModel(2)
                )
                val a = BookingTileAdapter(list,0)
                rv.apply {
                    layoutManager = lm
                    adapter = a
                }
                title.text="else"
                chatUserButton.visibility = View.VISIBLE
                chatUserButton.text = "Chat with owner"
            }
        }


        back.setOnClickListener {
            finish()
        }

    }
}