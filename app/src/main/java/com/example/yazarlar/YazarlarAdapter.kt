package com.example.yazarlar

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class YazarlarAdapter(val yazarlarListesi: List<YazarlarModel>) :
    RecyclerView.Adapter<YazarlarViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): YazarlarViewHolder {
        return YazarlarViewHolder(parent)
    }

    override fun getItemCount(): Int {
        return yazarlarListesi.size
    }

    override fun onBindViewHolder(holder: YazarlarViewHolder, position: Int) {
        holder.bind(yazarlarListesi[position])

    }
}

