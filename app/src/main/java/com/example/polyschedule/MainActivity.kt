package com.example.polyschedule

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.polyschedule.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.scheduleRecycleView.layoutManager = LinearLayoutManager(this)
        binding.scheduleRecycleView.adapter = ScheduleAdapter(fillList())


    }
    private fun fillList(): List<String> {
        val data = ArrayList<String>()
        for (i in 0..30) {
            data.add("$i element")
        }
        return data
    }


}