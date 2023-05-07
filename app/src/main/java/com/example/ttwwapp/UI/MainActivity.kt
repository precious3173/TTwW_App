package com.example.ttwwapp.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.os.Handler
import android.os.Looper
import com.example.ttwwapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    // used viewBinding(check gradle file in 'buildFeatures')
    lateinit var mainBinding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root
        setContentView(view)
        //timer for transition to home screen
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed(object:Runnable{
            override fun run(){
                val intent = Intent(this@MainActivity, ActivityContainer::class.java)
                startActivity(intent)
            }
        },4000)

    }
}