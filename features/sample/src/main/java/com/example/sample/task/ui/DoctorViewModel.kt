package com.example.sample.task.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.evaph.core.base.BaseViewModel
import com.example.sample.task.model.DoctorResponse
import com.example.sample.task.repo.DoctorsRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DoctorViewModel @Inject constructor(private val doctorsRepo: DoctorsRepo): BaseViewModel() {
    fun getDoctors(): LiveData<DoctorResponse> {
        val mutableLiveData = MutableLiveData<DoctorResponse>()
        viewModelScope.launchCatching(
            block = {
                val response = doctorsRepo.getDoctors()
                mutableLiveData.value = response
            }, onError = ::handleError
        )
        return mutableLiveData;
    }
}