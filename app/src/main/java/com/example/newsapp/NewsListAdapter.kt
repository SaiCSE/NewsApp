//We can make an Adapter by following the below same steps, everytime we need a recyclerview


package com.example.newsapp
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



//4. Here we are creating an adapter class and we will extend the recyclerview
// and in the constructor, we create a arrayList of string type

class NewsListAdapter (private val items: ArrayList<String>, private val listener: NewsItemClicked): RecyclerView.Adapter<NewsViewHolder> (){
    //6. We pass the holder [NewsHolder] to the Recycleview Adapter, so that the adapter can pick the view from the adapter.


    //7.In this method we create a new variable view and assign it to a Layout Inflater
    //Layout Inflater takes the view in xml format and converts it into display format
    // And we return the NewsViewHolder that takes in the view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_news,parent,false)

        //14. Here we need a viewHolder, so we create it
        val viewHolder = NewsViewHolder(view)

        //13.We need to handle the clicks on the views so we set a onlclicklistner
        view.setOnClickListener {
          listener.onItemClicked(items[viewHolder.adapterPosition])
        }

        return viewHolder

    }


    //8. TO get the item [Number of views on the display], we return the size of the items
    override fun getItemCount(): Int {
        return  items.size
    }


    //9. Here in this method, we need to bind the  item [view] and the data
    // so we create a currentItem Variable and get its position in the ArrayList
    // and pass on the currentItem to the text on the titleview in the holder
    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val currentItem = items[position]
        holder.titleView.text = currentItem

    }
}


//5. This is the newsViewHolder that is taking in a itemView and the recyclerView is getting the view from viewHolder
//we will also create the small view components that will repeat themselves in the layout folder as item_news.xml
//Whenever we want to create a adapter, we need to create an viewholder and pass it on the adapter class

    class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    //the above view knows that the itemView only has one textView inside it, as we have seen in the item_news.xml
    val titleView: TextView = itemView.findViewById(R.id.title)

}


//13. Creating a new interface for telling the onclicklistner that the view has been clicked
interface NewsItemClicked {
    fun onItemClicked (item: String)
}