package com.dicoding.submission


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.PixelCopy.request
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class UniversityDetail : AppCompatActivity(){

    companion object {
        const val EXTRA_PHOTO = "extra_photo"
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_KONTAK = "extra_kontak"
        const val EXTRA_WEBSITE = "extra_website"
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_INSTAGRAM = "extra_ig"
        const val EXTRA_ALAMAT = "extra_alamat"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_layout)
        val actionbar = supportActionBar
        actionbar!!.title = "Detail University"
        actionbar.setDisplayHomeAsUpEnabled(true)

        val tvName: TextView = findViewById(R.id.univ_name)
        val imgPhotoo: ImageView = findViewById(R.id.univ_foto)
        val tvKontak: TextView = findViewById(R.id.univ_kontak)
        val tvWebsite: TextView = findViewById(R.id.univ_website)
        val tvEmail: TextView = findViewById(R.id.univ_email)
        val tvInstagram: TextView = findViewById(R.id.univ_ig)
        val tvAlamat: TextView = findViewById(R.id.univ_alamat)

        val tImg = intent.getIntExtra(EXTRA_PHOTO,0)
        val tName = intent.getStringExtra(EXTRA_NAME)
        val tKontak = intent.getStringExtra(EXTRA_KONTAK)
        val tWebsite = intent.getStringExtra(EXTRA_WEBSITE)
        val tEmail = intent.getStringExtra(EXTRA_EMAIL)
        val tIg = intent.getStringExtra(EXTRA_INSTAGRAM)
        val tAlamat = intent.getStringExtra(EXTRA_ALAMAT)


        tvName.text = tName
        Glide.with(this)
            .load(tImg)
            .apply(RequestOptions())
            .into(imgPhotoo)
        tvKontak.text = tKontak
        tvWebsite.text = tWebsite
        tvEmail.text = tEmail
        tvInstagram.text = tIg
        tvAlamat.text = tAlamat

    }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}