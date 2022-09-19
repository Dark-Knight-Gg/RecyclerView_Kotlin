package com.example.recyclerviewkotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class JobAdapter(private var listJob:ArrayList<Job> ) : android.support.v7.widget.RecyclerView.Adapter<JobAdapter.ViewHolder>() {

     class ViewHolder(view : View): android.support.v7.widget.RecyclerView.ViewHolder(view){
        var adapter_job_imgPicture: ImageView = view.findViewById(R.id.adadpter_job_imgPicture)
        var adapter_job_imgDelete: ImageView= view.findViewById(R.id.adapter_job_txtName)
        var adapter_job_txtName: TextView=view.findViewById(R.id.adapter_job_txtId)
        var adapter_job_txtId: TextView=view.findViewById(R.id.adapter_job_imgDelete)
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        TODO("Not yet implemented")
        var view = LayoutInflater.from(p0.context).inflate(R.layout.adapter_job,p0,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewholder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
        val job = listJob[position]
        viewholder.adapter_job_imgPicture.setImageResource(job.picture)
        viewholder.adapter_job_txtName.setText(job.name)
        viewholder.adapter_job_txtId.setText(job.id)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
        return listJob.size
    }

}