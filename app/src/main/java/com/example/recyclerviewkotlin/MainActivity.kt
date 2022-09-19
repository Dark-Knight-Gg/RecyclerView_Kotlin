package com.example.recyclerviewkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private val listJob = ArrayList<Job>()
    private lateinit var m1_txtTitle : TextView
    private lateinit var recyclerView : RecyclerView
    private  lateinit var jobAdapter :JobAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        m1_txtTitle =findViewById(R.id.m1_txtTitle)
        recyclerView =findViewById(R.id.m1_recyclerview)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager= LinearLayoutManager(this)
        listJob.add(Job("Id001","Sp01",R.drawable.delete))
        listJob.add(Job("Id002","Sp02",R.drawable.delete))
        listJob.add(Job("Id003","Sp03",R.drawable.delete))
        listJob.add(Job("Id004","Sp04",R.drawable.delete))
        jobAdapter = JobAdapter(listJob)
        recyclerView.adapter= jobAdapter

    }
}

