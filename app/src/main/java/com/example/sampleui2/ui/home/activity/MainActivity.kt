package com.example.sampleui2.ui.home.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sampleui2.ui.home.bookings.fragment.Page1314fragment
import com.example.sampleui2.ui.home.profile.fragment.Page15Fragment
import com.example.sampleui2.ui.home.message.fragment.Page40Fragment
import com.example.sampleui2.ui.home.favourites.fragment.Page49Fragment
import com.example.sampleui2.ui.home.home.fragment.Page8Fragment
import com.example.sampleui2.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val bottomnavigation : BottomNavigationView = findViewById(R.id.bottomNavigationViewMain)


        if (savedInstanceState == null) {
            val fragment = Page8Fragment()
            supportFragmentManager.beginTransaction().replace(R.id.fragment_container, fragment, fragment.javaClass.simpleName).commit()
        }

        val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.homemenu -> {
                    val fragment = Page8Fragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fragment,fragment.javaClass.simpleName).commit()
                    return@OnNavigationItemSelectedListener true
                }
                R.id.favouritesmenu -> {
                    val fragment = Page49Fragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fragment,fragment.javaClass.simpleName).commit()
                    return@OnNavigationItemSelectedListener true
                }
                R.id.booksingsmenu -> {
                    val fragment = Page1314fragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fragment,fragment.javaClass.simpleName).commit()
                    return@OnNavigationItemSelectedListener true
                }
                R.id.messagemenu -> {
                    val fragment = Page40Fragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fragment,fragment.javaClass.simpleName).commit()
                    return@OnNavigationItemSelectedListener true
                }
                R.id.profilemenu -> {
                    val fragment = Page15Fragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragment_container,fragment,fragment.javaClass.simpleName).commit()
                    return@OnNavigationItemSelectedListener true
                }
                else -> return@OnNavigationItemSelectedListener false
            }
        }

        bottomnavigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

    }
}