package com.example.sample.task.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.sample.R
import com.example.sample.databinding.DoctorItemBinding
import com.example.sample.task.model.Doctor

class DoctorAdapter (var doctorList: List<Doctor>): RecyclerView.Adapter<DoctorViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): DoctorViewHolder {
        return DoctorViewHolder(DoctorItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: DoctorViewHolder, position: Int) {
        doctorList.get(position).let {
            holder.bind(it)
        }
    }

    override fun getItemCount() = doctorList.size

}

class DoctorViewHolder(private val binding: DoctorItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
   fun bind(item: Doctor){
       binding.drImg.setImageResource(R.drawable.dr)
       binding.drnameTv.text = item .doctor_name
       binding.despecTv.text = item.specialist

       binding.feeTv.text = "Fees ${item.fees} EGP"
       binding.followupfeeTv.text = "Follow-up ${item.followup} EGP"
       if(item.accept_promocode){
           binding.cuponStatusTv.text = "Accept"
           binding.cuponCodeTv.text = "Promo Codes"
       }else{
           binding.cuponStatusTv.text = "Reject"
           binding.cuponCodeTv.text = ""
       }

       binding.availTv.text = "AVAILABLE FROM"
       binding.availTimeTv.text = item.available_from.substringAfter("from")
   }

}

