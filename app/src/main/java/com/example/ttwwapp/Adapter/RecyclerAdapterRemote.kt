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

                questionViewLayout.setOnClickListener {

                    when (remoteText.text.toString()){
                        "Why customize my phone and other devices?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                        Uri.parse("https://vimeo.com/813931238"));
                        it.context.startActivity(intent);}

                        "How do I get better with technology?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813926742"));
                            it.context.startActivity(intent);}
                        "How do I ask for help with technology?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813926747"));
                            it.context.startActivity(intent);}
                        "Does my attitude effect my ability to learn technology?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813926751"));
                            it.context.startActivity(intent);}
                        "What is Google Search?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813926755"));
                            it.context.startActivity(intent);}
                        "Why should I learn new things?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813926763"));
                            it.context.startActivity(intent);}
                        "How can my phone help me remember my medications?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813926768"));
                            it.context.startActivity(intent);}
                        "Can my phone help with my memory?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813926772"));
                            it.context.startActivity(intent);}
                        "How can my phone help me see small print?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813926778"));
                            it.context.startActivity(intent);}
                        "Can my phone help me sleep better?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813926799"));
                            it.context.startActivity(intent);}
                        "I'm visually impaired can my phone help?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813926810"));
                            it.context.startActivity(intent);}
                        "Why do I have to update my stuff" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813926817"));
                            it.context.startActivity(intent);}
                        "What is an anti-virus?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813926820"));
                            it.context.startActivity(intent);}
                        "Why do I need to secure my phone?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813926834"));
                            it.context.startActivity(intent);}
                        "What is Web MD?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813926839"));
                            it.context.startActivity(intent);}
                        "Does Talking Tech have a website?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813926845"));
                            it.context.startActivity(intent);}
                        "What's a good website for seniors?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813926852"));
                            it.context.startActivity(intent);}
                        "How do I protect my digital assets?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813926864"));
                            it.context.startActivity(intent);}
                        "How do I create and remember strong passwords?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813926867"));
                            it.context.startActivity(intent);}
                        "What is two-factor authentication (2FA) and how do I enable it? " -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813926874"));
                            it.context.startActivity(intent);}
                        "What is Wi-Fi, and how do I connect to it?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813926892"));
                            it.context.startActivity(intent);}
                        "What is the difference between a smartphone and a tablet?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813926931"));
                            it.context.startActivity(intent);}
                        "How do I tell whether I have an android or iPhone smartphone?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813926969"));
                            it.context.startActivity(intent);}
                        "How do I tell which make and model smartphone I have?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813926997"));
                            it.context.startActivity(intent);}
                        "How can I tell which version of android or iOS is on my phone?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813927013"));
                            it.context.startActivity(intent);}
                        "What is the difference between a smartphone a tablet and a laptop?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813927042"));
                            it.context.startActivity(intent);}
                        "What the difference a cellular network Wi-Fi and Bluetooth?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813927058"));
                            it.context.startActivity(intent);}
                        "What is email, and how do I set up an email account?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813927105"));
                            it.context.startActivity(intent);}
                        "What is social media, and how do I use it?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813927121"));
                            it.context.startActivity(intent);}
                        "What is email, and how do I set up an email account? " -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813927105"));
                            it.context.startActivity(intent);}
                        "How do I make a video call?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813927135"));
                            it.context.startActivity(intent);}
                        "What is zoom and how do I use it?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813927145"));
                            it.context.startActivity(intent);}
                        "How do I use a mouse and keyboard?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813927156"));
                            it.context.startActivity(intent);}
                        "How do I turn on my computer or smartphone?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813927174"));
                            it.context.startActivity(intent);}
                        "How do I create a new document or folder?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813927180"));
                            it.context.startActivity(intent);}
                        "How do I save and find a file?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813927210"));
                            it.context.startActivity(intent);}
                        "How do I print a document?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813927214"));
                            it.context.startActivity(intent);}
                        "What is a browser, and how do I use it?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813927220"));
                            it.context.startActivity(intent);}
                        "How do I set up a new printer?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813927228"));
                            it.context.startActivity(intent);}
                        "What is a cloud drive?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813927234"));
                            it.context.startActivity(intent);}
                        "What’s the difference between the major cloud drive services?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813927239"));
                            it.context.startActivity(intent);}
                        "How do I Get started with Google Drive?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813927247"));
                            it.context.startActivity(intent);}
                        "How do I Get started with Microsoft OneDrive?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813927255"));
                            it.context.startActivity(intent);}
                        "How do I Get started with iCloud?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813927262"));
                            it.context.startActivity(intent);}
                        "How do I Get started with Dropbox?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813927274"));
                            it.context.startActivity(intent);}
                        "Why should I update my devices and software and how do I do it?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813927278"));
                            it.context.startActivity(intent);}
                        "What is a P2P payment system?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813927293"));
                            it.context.startActivity(intent);}
                        "What’s the difference between the major P2P payment services?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813927304"));
                            it.context.startActivity(intent);}
                        "How do I Get started with PayPal?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813927313"));
                            it.context.startActivity(intent);}
                        "How do I Get started with Venmo?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813927322"));
                            it.context.startActivity(intent);}
                        "How do I Get started with CashApp?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813927337"));
                            it.context.startActivity(intent);}
                        "How do I Get started with Zelle?" -> {

                            val intent = Intent("android.intent.action.VIEW",
                                Uri.parse("https://vimeo.com/813927342"));
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


