package com.example.ttwwapp.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ttwwapp.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var homeBinding:ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        homeBinding = ActivityHomeBinding.inflate(layoutInflater)
        val view = homeBinding.root
}
}