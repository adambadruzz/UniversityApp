package com.dicoding.submission

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.content.Intent
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    private lateinit var rvUniv: RecyclerView
    private var list: ArrayList<University> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionbar = supportActionBar
        actionbar!!.title= "Home"

        rvUniv = findViewById(R.id.rv_university)
        rvUniv.setHasFixedSize(true)

        list.addAll(UniversityData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvUniv.layoutManager = LinearLayoutManager(this)
        val listUnivAdapter = UniversityAdapter(list)
        rvUniv.adapter = listUnivAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.appmenu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.profil -> {
                val iAbout = Intent(this@MainActivity, DevAbout::class.java)
                startActivity(iAbout)
            }
        }
    }
}