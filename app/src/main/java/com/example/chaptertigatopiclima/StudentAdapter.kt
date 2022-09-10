package com.example.chaptertigatopiclima

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class StudentAdapter(val listStudent: ArrayList<ListStudent>) : RecyclerView.Adapter<StudentAdapter.ViewHolder>() {

    var onClick : ((ListStudent)->Unit)? = null

    //ambil id dari layout
    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        var namaStudent = view.findViewById<TextView>(R.id.txtNamaStudent)
        var nimStudent = view.findViewById<TextView>(R.id.txtNimStudent)
        var imgStudent = view.findViewById<ImageView>(R.id.imgStudent)
        var card = view.findViewById<CardView>(R.id.cardView)

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
        holder.card.setOnClickListener{
            onClick?.invoke(listStudent[position])
        }

    // txtnama.text = "nama saya"

    }

    // ada berapa item yang akan muncul di recycleView
    override fun getItemCount(): Int {
        return listStudent.size

    }
}