package com.gka.healthcareapp.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gka.healthcareapp.*
import com.gka.healthcareapp.adapters.DepartmentRecyclerAdapter
import com.gka.healthcareapp.adapters.DoctorRecyclerAdapter
import com.gka.healthcareapp.model.Department
import com.gka.healthcareapp.model.Doctor
import com.gka.healthcareapp.offline.PrefManager

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {

    private lateinit var recyclerViewDepartment: RecyclerView
    private lateinit var recyclerViewDoctor: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerViewDepartment = view.findViewById(R.id.rv_department)
        recyclerViewDepartment.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = DepartmentRecyclerAdapter(context, departments = departmentData())
            hasFixedSize()
        }

        recyclerViewDoctor = view.findViewById(R.id.rv_doctor)
        recyclerViewDoctor.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = DoctorRecyclerAdapter(context, doctors = doctorData())
            hasFixedSize()
        }

        val sharedPref = PrefManager.getInstance(context)
        val name: TextView = view.findViewById(R.id.textView_home_name)
        name.text = sharedPref.getName()
    }

    private fun departmentData(): ArrayList<Department> {
        val data = ArrayList<Department>()
        data.add(Department("Theatre", "6 Doctors", R.drawable.ic_baseline_restore_24))
        data.add(Department("Cardiology", "15 Doctors", R.drawable.ic_baseline_favorite_24))
        data.add(Department("Psychology", "4 Doctors", R.drawable.ic_baseline_psychology_24))
        data.add(Department("Ophthalmology", "6 Doctors", R.drawable.ic_baseline_remove_red_eye_24))

        return data
    }

    private fun doctorData(): ArrayList<Doctor> {
        val data = ArrayList<Doctor>()
        data.add(Doctor("Dr. John Rodriguez", "Surgeon", "Tue, 26 May at 9:30", R.drawable.person))
        data.add(Doctor("Dr. John Rodriguez", "Surgeon", "Tue, 26 May at 9:30", R.drawable.person))
        data.add(Doctor("Dr. John Rodriguez", "Surgeon", "Tue, 26 May at 9:30", R.drawable.person))
        data.add(Doctor("Dr. John Rodriguez", "Surgeon", "Tue, 26 May at 9:30", R.drawable.person))

        return data
    }
}