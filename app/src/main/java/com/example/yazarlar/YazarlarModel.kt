package com.example.yazarlar

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class YazarlarModel(
    val profilePhotoLink: Int,
    val kitapAdi: String,
    val yazarAdi: String,
    val yazarUlkesi: String,
    val konu: String
) : Parcelable