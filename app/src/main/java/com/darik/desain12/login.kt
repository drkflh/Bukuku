package com.darik.desain12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        supportActionBar?.hide()
        val intentButton: TextView = findViewById(R.id.txtbtn)
        intentButton.setOnClickListener{ viewDetail() }
    }
    private fun viewDetail(){
        val intent = Intent (this, home::class.java)
        startActivity(intent)
    }
    }