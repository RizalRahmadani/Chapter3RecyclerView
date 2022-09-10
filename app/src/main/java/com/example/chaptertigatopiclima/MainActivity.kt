package com.example.chaptertigatopiclima

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main_latihan.*

class MainActivity : AppCompatActivity() {

    lateinit var adapterStudentDiff : StudentAdapterDiffUtil
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapterStudentDiff = StudentAdapterDiffUtil()

        val listStudent = arrayListOf(

            ListStudent("Andika", "12345", R.drawable.sulawesi_utara),
            ListStudent("akmal", "23454", R.drawable.sulawesi_selatan),
            ListStudent("joni", "32234", R.drawable.sulawesi_barat),
            ListStudent("akbar", "6324", R.drawable.sulawesi_tengah),
            ListStudent("sinta","74323", R.drawable.sulawesi_tenggara)
        )

        var adapterStudent = StudentAdapter(listStudent)

        val lm = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
//
//        var grit = GridLayoutManager(this,2)
//        rvStudent.layoutManager= grit

        rvStudent.layoutManager = lm

        rvStudent.adapter = adapterStudent

        adapterStudent.onClick ={
            var pindah = Intent(this,DetailStudentActivity::class.java)
            pindah.putExtra("detailStudent", it)
            startActivity(pindah)
        }

        btntanpaDiff.setOnClickListener {
            listStudent[3] = ListStudent("update rizal", "11111111", R.drawable.riau)
            adapterStudent = StudentAdapter(listStudent)
            rvStudent.adapter = adapterStudent
            adapterStudent.notifyDataSetChanged()
        }
        btndiff.setOnClickListener {
            val list : MutableList<ListStudent> = listStudent.toMutableList()
            listStudent[1] = ListStudent("Update Titi", " 319842", R.drawable.papua_tengah)
            adapterStudentDiff = StudentAdapterDiffUtil()
            adapterStudentDiff.submitData(listStudent)
            rvStudent.adapter = adapterStudentDiff

        }


    }



}
