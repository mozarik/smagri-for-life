package com.example.smagri_main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_login.view.*

class login : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_login, container, false)

        //After we hit the login button on the login fragment we navigate to Home Fragment
        view.login_login_btn.setOnClickListener {
            Toast.makeText(
                context,
                "Login button on Login Fragment has Ben Clicked",
                Toast.LENGTH_SHORT
            ).show()
        }

        // After tap the register button on login layout, it goes to register layout
        view.register_login_btn.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_login_to_registerFragment2)
        }

        return view
    }

}