package com.example.ttwwapp.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ttwwapp.Adapter.RecyclerAdapter
import com.example.ttwwapp.DataResource.AnswerList
import com.example.ttwwapp.R
import com.example.ttwwapp.databinding.FragmentFindAnswerBinding

class FindAnswer : Fragment() {
    lateinit var recyclerAdapter: RecyclerAdapter
    lateinit var findAnswerBinding: FragmentFindAnswerBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        findAnswerBinding = FragmentFindAnswerBinding.inflate(layoutInflater)


        val recyclerView = findAnswerBinding.recyclerview
        recyclerAdapter = RecyclerAdapter()

        recyclerAdapter.differ.submitList(AnswerList.answers())
        recyclerView.apply {

            adapter = recyclerAdapter
            setHasFixedSize(true)
        }

        return findAnswerBinding.root
    }


}