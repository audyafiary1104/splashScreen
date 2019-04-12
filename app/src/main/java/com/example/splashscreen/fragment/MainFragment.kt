package com.example.splashscreen.fragment

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.FrameLayout
import com.example.splashscreen.R
import kotlinx.android.synthetic.main.fragment_1.*
import kotlinx.android.synthetic.main.index.*

class MainFragment  : AppCompatActivity() {
    private var content: FrameLayout? = null

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_satu -> {
                val fragment = fragment.newInstance()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dua -> {
                val fragment = fragment2()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_tiga -> {
                val fragment = fragment3()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_empat -> {
                val fragment = fragment2()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_lima-> {
                val fragment = fragment2()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    private fun addFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .setCustomAnimations(R.anim.design_bottom_sheet_slide_in, R.anim.design_bottom_sheet_slide_out)
            .replace(R.id.content, fragment, fragment.javaClass.getSimpleName())
            .commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.index)
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        val fragment = fragment.newInstance()
        addFragment(fragment)

    }
}