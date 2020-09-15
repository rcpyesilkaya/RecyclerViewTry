package com.recepyesilkaya.recyclerviewtry.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.recepyesilkaya.recyclerviewtry.R
import com.recepyesilkaya.recyclerviewtry.model.JobModel
import com.recepyesilkaya.recyclerviewtry.ui.DetailActivity
import kotlinx.android.synthetic.main.adapter_job_item.view.*

class JobAdapter(private val jobList:List<JobModel>,private val setOnClickListener:(JobModel,Int)->Unit): RecyclerView.Adapter<JobViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JobViewHolder {
        return JobViewHolder(parent)
    }

    override fun onBindViewHolder(holder: JobViewHolder, position: Int) {
        holder.bind(jobList[position],position,setOnClickListener)
    }

    override fun getItemCount(): Int {
        return jobList.size
    }
}