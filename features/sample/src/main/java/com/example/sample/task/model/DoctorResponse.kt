package com.example.sample.task.model
import com.google.gson.annotations.SerializedName

data class DoctorResponse(
    @SerializedName("Data") val data: Data,
    @SerializedName("Message") val message : String,
    @SerializedName("ErrorList") val errorList : List<Any>
)

data class Data (
    @SerializedName("DoctorList") val doctorList : List<Doctor>
)