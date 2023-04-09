package com.example.ttwwapp.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.fragment.NavHostFragment
import com.example.ttwwapp.R

class ActivityContainer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_container)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_graph) as NavHostFragment?
//        val navController = navHostFragment!!.navController
    }
}