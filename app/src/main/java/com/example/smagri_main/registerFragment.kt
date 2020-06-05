package com.example.smagri_main

import android.os.Bundle
import android.text.method.Touch
import android.util.Log
import android.view.Gravity
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_login.view.*
import kotlinx.android.synthetic.main.fragment_register.*
import kotlinx.android.synthetic.main.fragment_register.view.*
import kotlinx.android.synthetic.main.fragment_register.view.register_register_btn


class registerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_register, container, false)

        //Afer clicking Register button on Register fragment we need to register the user.
        view.register_register_btn.setOnClickListener {
            Toast.makeText(
                context,
                "Register button on Register Fragment is clicked",
                Toast.LENGTH_SHORT
            ).show()
        }

        return view
    }

}