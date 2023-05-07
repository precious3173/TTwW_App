package com.example.ttwwapp.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.ttwwapp.R
import com.example.ttwwapp.databinding.FragmentHomeScreenBinding

class HomeScreen : Fragment() {
  lateinit var binding: FragmentHomeScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentHomeScreenBinding.inflate(layoutInflater)

        binding.findAnswerButton.setOnClickListener {

            findNavController().navigate(R.id.action_homeScreen_to_findAnswer2)
        }
        binding.requestButton.setOnClickListener {
            findNavController().navigate(R.id.action_homeScreen_to_requestRemote2)
        }
        return binding.root
    }



}