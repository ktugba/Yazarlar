package com.example.yazarlar

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class YazarlarViewHolder(container: ViewGroup) :
    RecyclerView.ViewHolder(
        //xml deki verilere bakarak arayüz viewvi oluşturuyor
        LayoutInflater.from(container.context).inflate
            (
            R.layout.activity_detay,
            container,
            false
        )
    ) {
    val crdView: CardView = itemView.findViewById(R.id.cardview1)
    val profileLink: ImageView = itemView.findViewById(R.id.imgProfilePhoto)
    val txtKitapAdi: TextView = itemView.findViewById(R.id.txtKitapAdi)
    val txtYazarAdi: TextView = itemView.findViewById(R.id.txtYazarAdi)
    val txtYazarUlkesi: TextView = itemView.findViewById(R.id.txtYazarUlkesi)


    fun bind(yazarlarModel: YazarlarModel) {

        profileLink.setImageResource(yazarlarModel.profilePhotoLink)
        txtKitapAdi.text = yazarlarModel.kitapAdi
        txtYazarAdi.text = yazarlarModel.yazarAdi
        txtYazarUlkesi.text = yazarlarModel.yazarUlkesi


        itemView.setOnClickListener {
            val intent = Intent(itemView.context, SefillerActivity::class.java)
            intent.putExtra("name", yazarlarModel)
            itemView.context.startActivity(intent)
        }


    }

}