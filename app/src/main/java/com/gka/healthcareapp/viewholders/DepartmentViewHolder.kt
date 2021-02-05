package com.gka.healthcareapp.viewholders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.gka.healthcareapp.R
import com.gka.healthcareapp.model.Department

class DepartmentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val name: TextView = itemView.findViewById(R.id.textView_department)
    private val doctors: TextView = itemView.findViewById(R.id.textView_doctors)
    private val image: ImageView = itemView.findViewById(R.id.imageView_department)

    fun bind (department: Department) {
        name.text = department.name
        doctors.text = department.doctors
        image.setImageResource(department.image)
    }
}