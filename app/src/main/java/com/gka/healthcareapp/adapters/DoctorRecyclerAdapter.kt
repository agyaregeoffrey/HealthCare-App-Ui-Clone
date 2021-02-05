package com.gka.healthcareapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gka.healthcareapp.R
import com.gka.healthcareapp.model.Doctor
import com.gka.healthcareapp.viewholders.DoctorsViewHolder

class DoctorRecyclerAdapter(context: Context, private val doctors: List<Doctor>) :
        RecyclerView.Adapter<DoctorsViewHolder>() {

    private val layoutInflater = LayoutInflater.from(context)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoctorsViewHolder {
        val itemView = layoutInflater.inflate(R.layout.rv_item_doctors, parent, false)
        return DoctorsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: DoctorsViewHolder, position: Int) {
        val doctor = doctors[position]
        holder.bind(doctor)
    }

    override fun getItemCount() = doctors.size
}