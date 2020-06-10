package com.example.smagri_main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class AfterLoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_after_login)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.BottomNavView)
        val navController = findNavController(R.id.navHost)

        bottomNavigationView.setupWithNavController(navController)
    }
}