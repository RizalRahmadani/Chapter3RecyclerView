package com.example.chaptertigatopiclima.latihanrecycleview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chaptertigatopiclima.R
import kotlinx.android.synthetic.main.activity_main_latihan.*

class MainLatihan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_latihan)

        val listLatihan = arrayListOf(

            DataClassLatihan("Provinsi : Sulawesi Barat", "Ibukota : Mamuju", R.drawable.sulawesi_barat),
            DataClassLatihan("Provinsi : Sulawesi Tenggara", "Ibukota : Kendari", R.drawable.sulawesi_tenggara),
            DataClassLatihan("Provinsi : Sulawesi Tengah", "Ibukota : Palu", R.drawable.sulawesi_tengah),
            DataClassLatihan("Provinsi : Sumatera Barat", "Ibukota : Padang", R.drawable.sumatera_barat),
            DataClassLatihan("Provinsi : Sumatera Selatan", "Ibukota : Palembang", R.drawable.sumatera_selatan),
            DataClassLatihan("Provinsi : Bali", "Ibukota : Denpasar", R.drawable.bali),
            DataClassLatihan("Provinsi : Banten", "Ibukota : Serang", R.drawable.banten),
            DataClassLatihan("Provinsi : Bengkulu", "Ibukota : Bengkulu", R.drawable.bengkulu),
            DataClassLatihan("Provinsi : Gorontalo", "Ibukota : Gorontalo", R.drawable.gorontalo),
            DataClassLatihan("Provinsi : DI Yogyakarta", "Ibukota : Yogyakarta ", R.drawable.yogyakarta)

        )

        var adapterLatihan = AdapterLatihan(listLatihan)

        val linearVertical = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

        rvLatihan.layoutManager = linearVertical
        rvLatihan.adapter = adapterLatihan
    }
}
