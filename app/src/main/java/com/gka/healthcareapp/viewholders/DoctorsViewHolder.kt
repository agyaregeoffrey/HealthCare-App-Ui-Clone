package com.gka.healthcareapp.viewholders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gka.healthcareapp.R
import com.gka.healthcareapp.model.Doctor

class DoctorsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val doctorName: TextView = itemView.findViewById(R.id.textView_doctor_name)
    private val doctorTitle: TextView = itemView.findViewById(R.id.textView_doctor_title)
    private val doctorAvailability: TextView = itemView.findViewById(R.id.textView_doctor_availability)
    private val doctorImageView: ImageView = itemView.findViewById(R.id.imageView_chat_doctor)

    fun bind(doctor: Doctor) {
        doctorName.text = doctor.name
        doctorTitle.text = doctor.title
        doctorAvailability.text = doctor.availability
        doctorImageView.setImageResource(doctor.image)
    }
}