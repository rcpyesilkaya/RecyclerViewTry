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
import java.text.FieldPosition

class JobViewHolder(private val parent: ViewGroup) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context).inflate(
        R.layout.adapter_job_item, parent, false
    )
) {

    fun bind(jobList: JobModel, position: Int, setOnClickListener: (JobModel, Int) -> Unit) {
        itemView.txtSalary.text = jobList.salary
        itemView.txtName.text = jobList.name
        itemView.txtJob.text = jobList.job
        itemView.setOnClickListener {
            setOnClickListener(jobList,position)
        }

    }
}