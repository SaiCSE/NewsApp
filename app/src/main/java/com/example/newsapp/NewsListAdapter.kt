package com.example.newsapp

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//4. Here we are creating an adapter class and we will extend the recyclerview
// and in the constructor, we create a arrayList of string type


class NewsListAdapter (private val items: ArrayList<String>): RecyclerView.Adapter<NewsViewHolder> (){
    //6. We pass the holder is created we pass it to the Recycleview Adapter

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ??? {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ???, position: Int) {
        TODO("Not yet implemented")
    }
}


//5. This is the newsViewHolder that is taking in a itemView and the recyclerView is getting the view from viewHolder
//we will also create the small view components that will repeat themselves in the layout folder as item_news.xml
//Whenever we want to create a adapter, we need to create an viewholder and pass it on the adapter class

    class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    //the above view knows that the itemView only has one textView inside it, as we have seen in the item_news.xml
    val titleView: TextView = itemView.findViewById(R.id.title)

}