package com.example.sample.task.repo

import com.evaph.core.base.BaseRepo
import com.example.sample.task.model.DoctorResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject


class DoctorsRepo @Inject constructor(): BaseRepo() {

    suspend fun getDoctors() = withContext(Dispatchers.IO){
        networkManager.getRequest(
            api = com.evaph.network.network.Endpoints.DOCTORS,
            parseClass = DoctorResponse::class.java
        )
    }
   
}