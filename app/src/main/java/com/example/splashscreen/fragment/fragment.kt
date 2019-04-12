package com.example.splashscreen.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.splashscreen.R

class fragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_1, container, false)
    }

    companion object {
        fun newInstance(): fragment{
            val fragment = fragment()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}
