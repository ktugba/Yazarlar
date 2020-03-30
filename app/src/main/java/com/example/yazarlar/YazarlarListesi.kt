package com.example.yazarlar

import java.util.*

object MockList {

    fun getMockedYazarlarListesi(): List<YazarlarModel> {

        val yazarlarModel = YazarlarModel(
            R.drawable.sefiller,
            "Sefiller",
            "Victor Hugo",
            "Fransa",
            "   Sefiller dünya klasikleri listesinde yer alan, çok uzun olmasına rağmen okuyucuyu asla sıkmayan bir eserdir. Büyük Fransız yazar romantik akımın temsilcisi Victor Hugo tarafından kalem alınmıştır. Sefiller ilk olarak 1862 yılında basılmıştır. Bu eser o kadar başarılı şekilde kaleme alınmıştır ki kitap kahramanları ile sizlerde serüvenden serüvene koşarsınız. Kitabın asıl dili Fransızca'dır. Kitabın baş kahramanı olan Jean Valjean ekmek çaldığı için 5 yıl kürek cezasına mahkum edilmiştir. Buradan defalarca kaçmaya çalışması ile bu cezası 19 yıla çıkarılır. Cezasından sonra özgürlüğüne kavuşur fakat daha zor bir hayat onu bekler.\n" +
                    "\n" +
                    "   Toplum tarafından dışlanır ve adapte olmakta zorlanır. Bir suçlunun tüm çıplaklığı ile yaşam öyküsünü anlatır Sefiller kitabı. Okunması zor olan eserlerden biri olsa da her okuyucuda aynı heyecanı yaratmayı başarması klasikler arasına girmesine neden olur. Sefiller MEB tarafından orta öğretim öğrencilerine okuması için tavsiye ettiği 100 Temel Eser listesinde yer almaktadır.\n" +
                    "\n" +
                    "  Tanrı, hiç bir çocuğu kötü olsun diye yaratmaz! Onu kötü yapan, kötü eğitimdir!..Kötü anne-baba, kötü çevre, kötü yönetim balçık gibidir, zavallı yavruları da çekip yutar. \n"
        )

        val yazarlarModel2 = YazarlarModel(
            R.drawable.zambak,
            "Vadideki Zambak",
            "Honore de Balzac",
            "Fransa",
            ""
        )

        val yazarlarModel3 = YazarlarModel(
            R.drawable.ana,
            "Ana",
            "Maksim Gorki",
            "Rusya",
            ""
        )

        val yazarlarModel4 = YazarlarModel(
            R.drawable.karamazov,
            "Karamazov Kardeşler",
            "Fyodor Dostoyevski",
            "Rusya",
            ""
        )

        val yazarlarModel5 = YazarlarModel(
            R.drawable.gazap,
            "Gazap Üzümleri ",
            "John Steinbeck",
            "İngiltere",
            ""
        )

        val yazarlarModel6 = YazarlarModel(
            R.drawable.canlar,
            "Ölü Canlar",
            "Nikolay Vasilyeviç Gogol",
            "Rusya",
            ""
        )

        val yazarlarModel7 = YazarlarModel(
            R.drawable.savas,
            "Savaş ve Barış",
            "Lev Nikoloyeviç Tolstoy",
            "Rusya",
            ""
        )


        val yazarlarModel8 = YazarlarModel(
            R.drawable.notlar,
            "Yeraltından Notlar",
            "Fyodor Dostoyevski",
            "Rusya",
            ""
        )

        val yazarlarModel9 = YazarlarModel(
            R.drawable.tepeler,
            "Uğultulu Tepeler",
            "Emily Bronte",
            "İngiltere",
            ""
        )

        val yazarlarModel10 = YazarlarModel(
            R.drawable.komedya,
            "İlahi Komedya",
            "Dante Alighieri",
            "İtalya",
            ""
        )


        val yazarlarModel11 = YazarlarModel(
            R.drawable.madame,
            "Madame Bovary",
            "Gustave Flaubert",
            "Fransa",
            ""
        )
        R.id.cardview1

        val yazarlarModel12 = YazarlarModel(
            R.drawable.gurur,
            "Aşk ve Gurur",
            "Jane Austen",
            "İngiltere",
            ""
        )

        val yazarlarModel13 = YazarlarModel(
            R.drawable.silahs,
            "Üç Silahşörler",
            "Alexandre Dumas",
            "Fransa",
            ""
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