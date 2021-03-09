package com.example.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), NewsItemClicked {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // 1. For the recycler view Ww need a layout manager and a adaptor
        //here lets call the recyclerView and get the layout manager
        //layout manager tells how your recyclerView should be represented, say Linear, gird, stagered view, etc
        // view holder holds the xml views and passes onto the adaptor so that it can bind it with the data
        //Adaptor takes the xml view and data,  binds them togeather in the recycler view
        // Mak sure to add [id  'kotlin-android-extensions'] plugin in the app grade file to get the recyclerView working


        //2 .Here we have made a linerlayout for our recyclerview
        recyclerView.layoutManager = LinearLayoutManager(this)


        //3 .Now to we need to create a adapter class to use the same



        //11. now we give the value of items a s fetchData()
        val items = fetchData()

        //10. now we will use the adapter class in the recycle view
        //14. We want the NewsItemClicked to be implemented in the main activity, so give a this reference in the NewsListAdapter and with [alt enter]
        // we can implement the NewsItemClicked, we can see the implementation on the mainActivity class also.
        // also, below at line 63, we a new function onItemClicked

        val adapter = NewsListAdapter(items, this)

        //12. now we have attached the adapter to the recycler view
        recyclerView.adapter = adapter



    }




       //13. Now as we need to get some data, we will create a private function to get the data

         private fun fetchData(): ArrayList<String> {
         val list = ArrayList<String>()
             for (i in 0 until 100){
                 list.add(("item $i"))
             }

          return list
    }

    //15. Now we put a toast on this function, so that whenever an item is clicked we get the below message
    override fun onItemClicked(item: String) {
        Toast.makeText(this, "Clicked item is $item", Toast.LENGTH_LONG).show()
    }


}