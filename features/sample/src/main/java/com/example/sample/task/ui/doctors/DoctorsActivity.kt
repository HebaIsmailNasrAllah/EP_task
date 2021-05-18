package com.example.sample.task.ui.doctors

import android.util.Log
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.evaph.core.base.BaseActivity
import com.example.sample.databinding.ActivityDoctorsBinding
import com.example.sample.task.ui.DoctorViewModel
import com.example.sample.task.ui.adapter.DoctorAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DoctorsActivity : BaseActivity<ActivityDoctorsBinding, DoctorViewModel>() {
    lateinit var myAdapter: DoctorAdapter
    override fun initBinding(): ActivityDoctorsBinding {
        return ActivityDoctorsBinding.inflate(layoutInflater)
    }

    override fun initViewModel() {
        viewModel = ViewModelProvider(this)[DoctorViewModel::class.java]
    }

    override fun onActivityCreated() {
        myAdapter = DoctorAdapter(listOf())
        binding.rvDoctors.adapter = myAdapter
        binding.rvDoctors.layoutManager = LinearLayoutManager(applicationContext)
        showLoading()
        viewModel.getDoctors().observe(this, {

            // Log.i("TAG", it.data.doctorList.get(0).doctor_name)
            myAdapter.doctorList = it.data.doctorList
            myAdapter.notifyDataSetChanged()

            hideLoading()
        })
    }


}