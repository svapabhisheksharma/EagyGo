package com.example.sampleui2.ui.home.message.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sampleui2.ui.home.message.adapter.ChatAdapter
import com.example.sampleui2.ui.home.message.model.ChatModel
import com.example.sampleui2.R
import com.example.sampleui2.RvDecorationLinear
import kotlin.math.roundToInt

class Chat : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.messsage_chat_activity)
        window.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN)

        val list = listOf(
                ChatModel(0,"Hellow Vincent, thank you " +
                        "for calling Provide.","10:30"),
                ChatModel(1,"Perfect, I am really glad " +
                        "to hear that!","10:30"),
                ChatModel(0,"I am really sorry to hear that." +
                        "Is there anything I can do to help " +
                        "you?","10:32"),
                ChatModel(1,"That's is a good","10:32"),
                ChatModel(0,"I'm not sure, but let me find","10:33")
        )

        val rv :RecyclerView = findViewById(R.id.recyclerview)
        rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        rv.adapter = ChatAdapter(list)
        rv.addItemDecoration(RvDecorationLinear(
                (resources.displayMetrics.density * 0).roundToInt(),
                (resources.displayMetrics.density *7 ).roundToInt()
        ))

        val heading :TextView = findViewById(R.id.txt_name)
        val image :ImageView = findViewById(R.id.img_person)

        heading.text = intent.extras?.getString("name")
        intent.extras?.getInt("resource")?.let { image.setImageResource(it) }

        findViewById<ImageView>(R.id.img_back).setOnClickListener {
            finish()
        }

    }
}