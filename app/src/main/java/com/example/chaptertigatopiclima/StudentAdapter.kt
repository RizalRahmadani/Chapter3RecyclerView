package com.example.chaptertigatopiclima

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentAdapter(val listStudent: ArrayList<ListStudent>) : RecyclerView.Adapter<StudentAdapter.ViewHolder>() {

    //ambil id dari layout
    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        var namaStudent = view.findViewById<TextView>(R.id.txtNamaStudent)
        var nimStudent = view.findViewById<TextView>(R.id.txtNimStudent)
        var imgStudent = view.findViewById<ImageView>(R.id.imgStudent)

    }
// buat object viewHolder - untuk register view - inflate layout
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_student, parent, false)
    return ViewHolder(view)

    }

// untuk set data ke layoutnya
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.namaStudent.text = listStudent[position].nama
        holder.nimStudent.text = listStudent[position].nim
        holder.imgStudent.setImageResource(listStudent[position].img)

    // txtnama.text = "nama saya"

    }

    // ada berapa item yang akan muncul di recycleView
    override fun getItemCount(): Int {
        return listStudent.size

    }
}