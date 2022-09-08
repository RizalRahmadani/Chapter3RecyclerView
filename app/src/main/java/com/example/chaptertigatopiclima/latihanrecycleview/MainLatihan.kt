package com.example.chaptertigatopiclima.latihanrecycleview

import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chaptertigatopiclima.R
import kotlinx.android.synthetic.main.activity_main_latihan.*

class MainLatihan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_latihan)

        val listLatihan = arrayListOf(
            DataClassLatihan("Provinsi : Nanggroe Aceh Darussalam", "Ibukota : Banda Aceh", R.drawable.aceh),
            DataClassLatihan("Provinsi : Bali", "Ibukota : Denpasar", R.drawable.bali),
            DataClassLatihan("Provinsi : Bangka Belitung", "Ibukota : Pangkal Pinang", R.drawable.banka_belitung),
            DataClassLatihan("Provinsi : Banten", "Ibukota : Serang", R.drawable.banten),
            DataClassLatihan("Provinsi : Bengkulu", "Ibukota : Bengkulu", R.drawable.bengkulu),
            DataClassLatihan("Provinsi : DKI Jakatra", "Ibukota : Jakarta", R.drawable.dki_jakarta),
            DataClassLatihan("Provinsi : Gorontalo", "Ibukota : Gorontalo", R.drawable.gorontalo),
            DataClassLatihan("Provinsi : Jambi", "Ibukota : Jambi", R.drawable.jambi),
            DataClassLatihan("Provinsi : Jawa Barat", "Ibukota : Bandung", R.drawable.jawa_barat),
            DataClassLatihan("Provinsi : Jawa Tengah", "Ibukota : Semarang", R.drawable.jawa_tengah),
            DataClassLatihan("Provinsi : Jawa Timur", "Ibukota : Surabaya", R.drawable.jawa_timur),
            DataClassLatihan("Provinsi : Kalimantan Barat", "Ibukota : Pontianak", R.drawable.kalimantan_barat),
            DataClassLatihan("Provinsi : Kalimantan Selatan", "Ibukota : Banjarbaru", R.drawable.kalimantan_selatan),
            DataClassLatihan("Provinsi : Kalimantan Tengah", "Ibukota : Palangkaraya", R.drawable.kalimantan_tengah),
            DataClassLatihan("Provinsi : Kalimantan Timur", "Ibukota : Samarinda", R.drawable.kalimantan_timur),
            DataClassLatihan("Provinsi : Kalimantan Utara", "Ibukota : Tanjung Selor", R.drawable.kalimantan_utara),
            DataClassLatihan("Provinsi : Kepulauan Riau", "Ibukota : Tanjung Pinang", R.drawable.riau),
            DataClassLatihan("Provinsi : Lampung", "Ibukota : Bandar Lampung", R.drawable.lampung),
            DataClassLatihan("Provinsi : Maluku", "Ibukota : Ambon", R.drawable.maluku),
            DataClassLatihan("Provinsi : Maluku Utara", "Ibukota : Sofifi", R.drawable.maluku_utara),
            DataClassLatihan("Provinsi : Nusa Tenggara Barat", "Ibukota : Mataram", R.drawable.ntb),
            DataClassLatihan("Provinsi : Nusa Tenggara Timur", "Ibukota : Kupang", R.drawable.ntt),
            DataClassLatihan("Provinsi : Papua", "Ibukota : Jayapura", R.drawable.papua),
            DataClassLatihan("Provinsi : Papua Barat", "Ibukota : Manokwari", R.drawable.papua_barat),
            DataClassLatihan("Provinsi : Papua Selatan", "Ibukota : Kabupaten Marauke", R.drawable.papua_selatan),
            DataClassLatihan("Provinsi : Papua Tengah", "Ibukota : Kabupaten Nabire", R.drawable.papua_tengah),
            DataClassLatihan("Provinsi : Riau", "Ibukota : Pekanbaru", R.drawable.riau),
            DataClassLatihan("Provinsi : Sulawesi Barat", "Ibukota : Mamuju", R.drawable.sulawesi_barat),
            DataClassLatihan("Provinsi : Sulawesi Selatan", "Ibukota : Makassar", R.drawable.sulawesi_selatan),
            DataClassLatihan("Provinsi : Sulawesi Tengah", "Ibukota : Palu", R.drawable.sulawesi_tengah),
            DataClassLatihan("Provinsi : Sulawesi Tenggara", "Ibukota : Kendari", R.drawable.sulawesi_tenggara),
            DataClassLatihan("Provinsi : Sulawesi Utara", "Ibukota : Manado", R.drawable.sulawesi_utara),
            DataClassLatihan("Provinsi : Sumatera Barat", "Ibukota : Padang", R.drawable.sumatera_barat),
            DataClassLatihan("Provinsi : Sumatera Selatan", "Ibukota : Palembang", R.drawable.sumatera_selatan),
            DataClassLatihan("Provinsi : Sumatera Utara", "Ibukota : Medan", R.drawable.sumatera_utara),
            DataClassLatihan("Provinsi : DI Yogyakarta", "Ibukota : Yogyakarta ", R.drawable.yogyakarta)

        )

        var adapterLatihan = AdapterLatihan(listLatihan)

        val linearVertical = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        val grid = GridLayoutManager(this, 2)

        if (applicationContext.resources.configuration.orientation == Configuration.ORIENTATION_LANDSCAPE){
            rvLatihan.layoutManager = grid
        }else{
            rvLatihan.layoutManager = linearVertical
        }
        rvLatihan.adapter = adapterLatihan
    }
}
