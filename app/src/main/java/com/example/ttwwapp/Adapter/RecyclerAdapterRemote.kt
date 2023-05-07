package com.example.ttwwapp.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.ttwwapp.DataResource.AnswerList
import com.example.ttwwapp.databinding.RemoteLayoutBinding

class RecyclerAdapterRemote(): RecyclerView.Adapter<RecyclerAdapterRemote.Remote>() {
    val listOfRemote = ArrayList<AnswerList>()

    class Remote(private val remoteLayoutBinding: RemoteLayoutBinding) : RecyclerView.ViewHolder(remoteLayoutBinding.root) {
        fun bind(list: AnswerList) {
            remoteLayoutBinding.apply {
                remoteText.text = list.answer
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Remote {
        val binding: RemoteLayoutBinding = RemoteLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return Remote(binding)
    }

    override fun onBindViewHolder(holder: Remote, position: Int) {
        holder.bind(differ.currentList[position])
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }
    private val diffUtil: DiffUtil.ItemCallback<AnswerList> = object: DiffUtil.ItemCallback<AnswerList>(){
        override fun areItemsTheSame(oldItem: AnswerList, newItem: AnswerList): Boolean {
            return  oldItem.answer == newItem.answer
        }

        override fun areContentsTheSame(oldItem: AnswerList, newItem: AnswerList): Boolean {
            return oldItem == newItem
        }

    }
    val differ = AsyncListDiffer(this, diffUtil)
}


