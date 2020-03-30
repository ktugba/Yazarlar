package com.example.yazarlar

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SefillerActivity : AppCompatActivity() {

    private lateinit var yazarlarModel: YazarlarModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sefiller)

        val txtkonu: TextView = findViewById(R.id.txtkonu)
        val profileLink: ImageView = findViewById(R.id.imgProfilePhoto)
        yazarlarModel = intent.getParcelableExtra("name")
        txtkonu.text = yazarlarModel.konu
        profileLink.setImageResource(yazarlarModel.profilePhotoLink)

    }
}