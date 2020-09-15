package com.recepyesilkaya.recyclerviewtry.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.OvershootInterpolator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.recepyesilkaya.recyclerviewtry.R
import com.recepyesilkaya.recyclerviewtry.adapter.JobAdapter
import com.recepyesilkaya.recyclerviewtry.mock.mock
import com.recepyesilkaya.recyclerviewtry.model.JobModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rcyJob.adapter = JobAdapter(mock.getList()) { jobModel, i ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("key", jobModel)
            startActivity(intent)
        }

    }
}