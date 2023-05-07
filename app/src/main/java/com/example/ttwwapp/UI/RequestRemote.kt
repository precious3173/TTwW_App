package com.example.ttwwapp.UI

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ttwwapp.Adapter.RecyclerAdapterRemote
import com.example.ttwwapp.DataResource.AnswerList
import com.example.ttwwapp.databinding.FragmentRequestRemoteBinding


class RequestRemote: Fragment(){
    lateinit var recyclerAdapterRemote: RecyclerAdapterRemote
    lateinit var  requestRemoteBinding: FragmentRequestRemoteBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        requestRemoteBinding = FragmentRequestRemoteBinding.inflate(layoutInflater)


        val recyclerView2 = requestRemoteBinding.recyclerview
        recyclerAdapterRemote = RecyclerAdapterRemote()

        recyclerAdapterRemote.differ.submitList(AnswerList.answers())
        recyclerView2.apply {

            adapter = recyclerAdapterRemote
            setHasFixedSize(true)
        }

        return requestRemoteBinding.root
    }
}