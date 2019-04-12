package com.example.splashscreen.fragment

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.splashscreen.R
import com.example.splashscreen.layout.fullcost
import com.example.splashscreen.layout.otherask
import com.example.splashscreen.layout.peoplewanted
import kotlinx.android.synthetic.main.fragment_3.*

class fragment3: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_3, container, false)

    }

    companion object {
        fun newInstance(): fragment{
            val fragment = fragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_full_cost_type.setOnClickListener {
            startActivity(Intent(context, fullcost::class.java))
        }
        btn_people_wanted_type.setOnClickListener {
            startActivity(Intent(context, peoplewanted::class.java))

        }
        btn_other_ask_type.setOnClickListener {
            startActivity(Intent(context, otherask::class.java))

        }
    }
}