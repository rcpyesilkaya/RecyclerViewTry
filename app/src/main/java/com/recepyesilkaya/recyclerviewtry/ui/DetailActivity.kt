package com.recepyesilkaya.recyclerviewtry.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.recepyesilkaya.recyclerviewtry.R
import com.recepyesilkaya.recyclerviewtry.model.JobModel
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val list: JobModel? = intent.getParcelableExtra<JobModel>("key")

        list?.let {

            txtJobDetail.text = list.salary
            txtNameDetail.text = list.name
            txtSalaryDetail.text = list.job
        }
    }
}