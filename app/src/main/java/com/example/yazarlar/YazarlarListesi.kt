package com.example.yazarlar

import java.util.*

object MockList {

    fun getMockedYazarlarListesi(): List<YazarlarModel> {

        val yazarlarModel = YazarlarModel(
            "aasasaas",
            "Sefiller",
            "Victor Hugo",
            "Fransa"
        )

        val yazarlarModel2 = YazarlarModel(
            "asasas",
            "Vadideki Zambak",
            "Honore de Balzac",
            "Fransa"
        )

        val yazarlarModel3 = YazarlarModel(
            "asasas",
            "Ana",
            "Maksim Gorki",
            "Rusya"
        )

        val yazarlarModel4 = YazarlarModel(
            "asasas",
            "Karamazov Kardeşler",
            "Fyodor Dostoyevski",
            "Rusya"
        )

        val yazarlarModel5 = YazarlarModel(
            "asasas",
            "Gazap Üzümleri ",
            "John Steinbeck",
            "İngiltere"
        )

        val yazarlarModel6 = YazarlarModel(
            "asasas",
            "Ölü Canlar",
            "Nikolay Vasilyeviç Gogol",
            "Rusya"
        )

        val yazarlarModel7 = YazarlarModel(
            "asasas",
            "Savaş ve Barış",
            "Lev Nikoloyeviç Tolstoy",
            "Rusya"
        )


        val yazarlarModel8 = YazarlarModel(
            "asasas",
            "Yeraltından Notlar",
            "Fyodor Dostoyevski",
            "Rusya"
        )

        val yazarlarModel9 = YazarlarModel(
            "asasas",
            "Uğultulu Tepeler",
            "Emily Bronte",
            "İngiltere"
        )

        val yazarlarModel10 = YazarlarModel(
            "asasas",
            "İlahi Komedya",
            "Dante Alighieri",
            "İtalya"
        )


        val yazarlarModel11 = YazarlarModel(
            "asasas",
            "Madame Bovary",
            "Gustave Flaubert",
            "Fransa"
        )

        val yazarlarModel12 = YazarlarModel(
            "asasas",
            "Aşk ve Gurur",
            "Jane Austen",
            "İngiltere"
        )

        val yazarlarModel13 = YazarlarModel(
            "asasas",
            "Aşk ve Gurur",
            "Alexandre Dumas",
            "Fransa"
        )


        val yazarlarListesi: ArrayList<YazarlarModel> = ArrayList()


        yazarlarListesi.add(yazarlarModel)
        yazarlarListesi.add(yazarlarModel2)
        yazarlarListesi.add(yazarlarModel3)
        yazarlarListesi.add(yazarlarModel4)
        yazarlarListesi.add(yazarlarModel5)
        yazarlarListesi.add(yazarlarModel6)
        yazarlarListesi.add(yazarlarModel7)
        yazarlarListesi.add(yazarlarModel8)
        yazarlarListesi.add(yazarlarModel9)
        yazarlarListesi.add(yazarlarModel10)
        yazarlarListesi.add(yazarlarModel11)
        yazarlarListesi.add(yazarlarModel12)
        yazarlarListesi.add(yazarlarModel13)

        return yazarlarListesi

    }
}