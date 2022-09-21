package com.example.polyschedule

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.polyschedule.databinding.LessonItemBinding
import java.util.*

class ScheduleAdapter(val list: List<String>): RecyclerView.Adapter<ScheduleAdapter.ScheduleHolder>()  {


    class ScheduleHolder(view: View): RecyclerView.ViewHolder(view) {
        var binding = LessonItemBinding.bind(view)
        fun bind(position: Int) {

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ScheduleHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.lesson_item, parent, false)
        return ScheduleHolder(view)
    }

    override fun onBindViewHolder(holder: ScheduleHolder, position: Int) {
        holder.bind(position)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}