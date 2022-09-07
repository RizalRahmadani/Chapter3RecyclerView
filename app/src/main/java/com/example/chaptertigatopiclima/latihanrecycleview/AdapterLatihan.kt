package com.example.chaptertigatopiclima.latihanrecycleview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.chaptertigatopiclima.R

class AdapterLatihan (val listLatihan : ArrayList<DataClassLatihan>)
    : RecyclerView.Adapter<AdapterLatihan.ViewHolder>() {

    class ViewHolder(tampilData : View): RecyclerView.ViewHolder(tampilData){
        var dataProvinsi = tampilData.findViewById<TextView>(R.id.txtProvinsi)
        var dataIbukota = tampilData.findViewById<TextView>(R.id.txtIbukota)
        var dataRumahAdat =tampilData.findViewById<ImageView>(R.id.imgProvinsi)

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_latihan, parent, false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.dataProvinsi.text = listLatihan[position].provinsi
        holder.dataIbukota.text = listLatihan[position].ibukota
        holder.dataRumahAdat.setImageResource(listLatihan[position].rumahAdat)

    }

    override fun getItemCount(): Int {
        return listLatihan.size

    }
}