package com.dicoding.submission

object UniversityData {
        private val univNames = arrayOf(
            "Universitas Indonesia",
            "Universitas Gadjah Mada",
            "Institut Pertanian Bogor",
            "Institut Teknologi Sepuluh November",
            "Universitas Brawijaya",
            "Universitas Airlangga",
            "Universitas Telkom",
            "Institut Teknologi Bandung",
            "Universitas Bina Nusantara",
            "Universitas Sebelas Maret UNS Surakarta")

        private val univImages = arrayOf(
            R.drawable.ui,
            R.drawable.ugm,
            R.drawable.ipb,
            R.drawable.its,
            R.drawable.ub,
            R.drawable.airlangga,
            R.drawable.telkom,
            R.drawable.itb,
            R.drawable.binus,
            R.drawable.uns)

        private val univKontak = arrayOf(
            "+62 21 786 7222",
            "+62 (274) 6492599",
            "+62 251 8622642 ",
            "031-5994251-54",
            "+62-341-551611",
            "+62 821-3004-0061",
            "(022) 7566456",
            "(022) 2500935",
            "+62 21 534 5830",
            "0271-646655")

        private val univWebsite = arrayOf(
            "www.ui.ac.id",
            "www.ugm.ac.id",
            "ipb.ac.id",
            "www.its.ac.id",
            "ub.ac.id",
            "www.unair.ac.id",
            "telkomuniversity.ac.id",
            "www.itb.ac.id",
            "binus.ac.id",
            "uns.ac.id/id")

        private val univEmail = arrayOf(
            "sipp@ui.ac.id",
            "info@ugm.ac.id",
            "ask@apps.ipb.ac.id",
            "humas@its.ac.id",
            "humas@ub.ac.id",
            "adm@pkip.unair.ac.id",
            "info@telkomuniversity.ac.id",
            "humas@itb.ac.id",
            "ss.senayan@binus.edu",
            "campus@mail.uns.ac.id")

        private val univIG = arrayOf(
            "univ_indonesia",
            "ugm.yogyakarta",
            "ipbofficial",
            "-",
            "univ.brawijaya",
            "univ_airlangga",
            "telkomuniversity.ac.id/",
            "itb1920",
            "binusuniversityofficial",
            "uns.official")

        private val univAlamat = arrayOf(
            "Jl. Margonda Raya, Pondok Cina, Kecamatan Beji, Kota Depok, Jawa Barat 16424",
            "Jl. Bulaksumur, Caturtunggal, Kec. Depok, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55281",
            "Jl. Raya Dramaga, Kampus IPB Dramaga Bogor, 16680 West Java, Indonesia",
            "Jl. Teknik Kimia, Keputih, Kec. Sukolilo, Kota SBY, Jawa Timur 60111",
            "Jl. Veteran, Ketawanggede, Kec. Lowokwaru, Kota Malang, Jawa Timur 65145",
            "Jl. Airlangga No.4 - 6, Airlangga, Kec. Gubeng, Kota SBY, Jawa Timur 60115",
            "Jl. Telekomunikasi Jl. Terusan Buah Batu, Sukapura, Kec. Dayeuhkolot, Kota Bandung, Jawa Barat 40257",
            "Jl. Ganesa No.10, Lb. Siliwangi, Kecamatan Coblong, Kota Bandung, Jawa Barat 40132",
            "Jl. K. H. Syahdan No. 9, Kemanggisan, Palmerah",
            "Jl. Ir. Sutami 36 Kentingan, Jebres, Surakarta, Jawa Tengah. Indonesia 57126")

        val listData: ArrayList<University>
        get() {
            val list = arrayListOf<University>()
            for (position in univNames.indices) {
                val univ = University()
                univ.name = univNames[position]
                univ.photo = univImages[position]
                univ.kontak = univKontak[position]
                univ.website = univWebsite[position]
                univ.email = univEmail[position]
                univ.ig = univIG[position]
                univ.alamat = univAlamat[position]
                list.add(univ)
            }
            return list
        }
    }
