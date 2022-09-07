package com.example.chaptertigatopiclima

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main_latihan.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listStudent = arrayListOf(

            ListStudent("Andika", "12345", R.drawable.ic_launcher_background),
            ListStudent("akmal", "23454", R.drawable.ic_launcher_background),
            ListStudent("joni", "32234", R.drawable.ic_launcher_background),
            ListStudent("akbar", "6324", R.drawable.ic_launcher_background),
            ListStudent("sinta","74323", R.drawable.ic_launcher_background)
        )

        var adapterStudent = StudentAdapter(listStudent)

        val lm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

        var grit = GridLayoutManager(this,2)
        rvStudent.layoutManager= grit

//        rvStudent.layoutManager = lm

        rvStudent.adapter = adapterStudent
    }



}
