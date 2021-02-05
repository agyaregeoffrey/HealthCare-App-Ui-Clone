package com.gka.healthcareapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.gka.healthcareapp.R
import com.gka.healthcareapp.model.Department
import com.gka.healthcareapp.viewholders.DepartmentViewHolder

class DepartmentRecyclerAdapter (context: Context, private val departments: List<Department>) : RecyclerView.Adapter<DepartmentViewHolder>() {

    private val layoutInflater = LayoutInflater.from(context)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DepartmentViewHolder {
        val itemView = layoutInflater.inflate(R.layout.rv_item_department, parent, false)
        return DepartmentViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: DepartmentViewHolder, position: Int) {
        val department = departments[position]
        holder.bind(department)
    }

    override fun getItemCount() = departments.size
}