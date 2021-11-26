package com.darik.desain12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)
        supportActionBar?.hide()
        val fcrud = findViewById<ImageView>(R.id.crud)
        val flogout = findViewById<ImageView>(R.id.logout)

        fcrud.setOnClickListener{
            val intentcrud = Intent(this, crud::class.java)
            startActivity(intentcrud)
        }

        flogout.setOnClickListener{
            val intentlogout = Intent(this, login::class.java)
            startActivity(intentlogout)
        }
    }
}