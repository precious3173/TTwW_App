package com.example.ttwwapp.DataResource

data class AnswerList(
    val answer:String
){

    companion object Answers{

        fun answers(): MutableList<AnswerList>{
            val mutableList:MutableList<AnswerList> = mutableListOf()

            mutableList.add(AnswerList("Why customize my phone and other devices?"))
            mutableList.add(AnswerList("How do I get better with technology?"))
            mutableList.add(AnswerList("How do I ask for help with technology?"))
            mutableList.add(AnswerList("Does my attitude effect my ability to learn technology?"))
            mutableList.add(AnswerList("What is Google Search?"))
            mutableList.add(AnswerList("Why should I learn new things?"))
            mutableList.add(AnswerList("How can my phone help me remember my medications?"))
            mutableList.add(AnswerList("Can my phone help with my memory?"))
            mutableList.add(AnswerList("How can my phone help me see small print??"))
            mutableList.add(AnswerList("What are audiobooks?"))
            mutableList.add(AnswerList("Can my phone help me sleep better?"))
            mutableList.add(AnswerList("I'm visually impaired can my phone help?"))
            mutableList.add(AnswerList("Why do I have to update my stuff."))
            mutableList.add(AnswerList("What is an anti-virus?"))
            mutableList.add(AnswerList("What is Web MD?"))

            return mutableList
        }

    }

}


