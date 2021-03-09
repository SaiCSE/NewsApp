package com.example.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
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

        //3 .Now to we need to create a adator class to use the same



    }
}