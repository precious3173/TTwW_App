package com.example.ttwwapp.Adapter

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.ttwwapp.DataResource.AnswerList
import com.example.ttwwapp.databinding.RemoteLayoutBinding

class RecyclerAdapterRemote(): RecyclerView.Adapter<RecyclerAdapterRemote.Remote>() {
    val listOfRemote = ArrayList<AnswerList>()

    class Remote(private val remoteLayoutBinding: RemoteLayoutBinding, private val context: Context) : RecyclerView.ViewHolder(remoteLayoutBinding.root) {
        fun bind(list: AnswerList) {
            remoteLayoutBinding.apply {
                remoteText.text = list.answer

                remoteText.setOnClickListener {

                    when (remoteText.text.toString()){
                        "Why customize my phone and other devices?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                        Uri.parse("https://vimeo.com/813931238"));
                        it.context.startActivity(intent);}

                        "How do I get better with technology?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813926742"));
                            it.context.startActivity(intent);}


                    }
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Remote {
        val binding: RemoteLayoutBinding = RemoteLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return Remote(binding, parent.context)
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


