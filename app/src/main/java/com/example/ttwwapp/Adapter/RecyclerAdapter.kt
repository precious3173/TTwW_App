package com.example.ttwwapp.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.ttwwapp.DataResource.AnswerList
import com.example.ttwwapp.databinding.AnswerLayoutBinding

class RecyclerAdapter(): RecyclerView.Adapter<RecyclerAdapter.Answer>() {
     val listOfAnswers = ArrayList<AnswerList>()

    class Answer(private val answerLayoutBinding: AnswerLayoutBinding) : RecyclerView.ViewHolder(answerLayoutBinding.root){

        fun bind(list: AnswerList){
         answerLayoutBinding.apply {
             answerText.text = list.answer
         }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Answer {
       val binding: AnswerLayoutBinding = AnswerLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return Answer(binding)
    }

    override fun onBindViewHolder(holder: Answer, position: Int) {
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