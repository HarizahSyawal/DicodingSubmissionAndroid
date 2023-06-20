package com.example.submissionapp.data;

import com.example.submissionapp.R;
import com.example.submissionapp.model.News;

import java.util.ArrayList;

public class NewsData {
    private static String [] newsTitle = {
            "Kaisar Jepang Kunjungi RI",
            "Putin Bakal ke Negara NATO",
            "Bill Gates Bertemu Xi Jinping",
            "Putin Beri Pesan Khusus untuk Para Taipan Rusia",
            "Hotman Paris Gelontorkan Dana Rp15 Miliar",
            "Ratusan Pegawai Twitter Diusir dari Kantor, Masalah Uang",
            "Porak-Poranda, Potret Kota-Kota AS Diterjang Tornado Dahsyat",
            "Harga Gula Dunia Menggila! India Biang Kerok, RI Bahaya",
            "Perusahaan Migor Sunco, Fortune Cs Terjerat Dugaan Korupsi",
            "Korupsi Wilmar, Musim Mas, Permata Hijau, Negara Rugi Rp6,4 T",
    };

    private static String [] newsDetail = {
            "",
            "Presiden Rusia Vladimir Putin dilaporkan akan mengadakan kunjungan ke negara NATO. Ia diagendakan bertamu ke Turki dalam beberapa waktu ke depan.\n" +
                    "Presiden Recep Tayyip Erdogan juga telah mengkonfirmasi hal ini. \"Ada rencana, tetapi ketentuan spesifik belum dibahas,\" kata penasihat Putin Yuri Ushakov kepada Interfax Rusia yang dikutip Newsweek, Jumat (16/6/2023).\n" +
                    "\n" +
                    "Hal ini terjadi di tengah masih panasnya perang antara Rusia dan Ukraina yang membuat Barat, termasuk NATO mengecam keras Rusia. NATO sendiri diketahui menjadi penyuplai utama perlengkapan perang ke Ukraina.",
            "Dalam kunjungan Bill Gates ke Beijing, pendiri Microsoft tersebut dan Presiden China Xi Jinping sempat berdiskusi soal kecerdasan buatan (AI). Xi menyatakan membuka pintu bagi teknologi AI dari AS untuk dibawa ke China. Selain itu, Xi dan Gates juga membahas perkembangan bisnis Microsoft di China.",
            "Presiden Rusia Vladimir Putin mendesak miliarder Rusia untuk menempatkan patriotisme di atas keuntungan. Hal ini terjadi saat kekuatan Barat menjatuhkan deretan sanksi kepada negara itu akibat serangannya ke Ukraina.\n" +
                    "Berbicara kepada elite bisnis Rusia secara pribadi untuk pertama kalinya sejak mengirim pasukan ke Ukraina, Kamis (16/3/2023), Putin mengatakan bahwa peran mereka bukan hanya untuk menghasilkan uang tetapi juga untuk mendukung masyarakat.",
            "HWG Group kembali akan menggelar pertandingan tinju profesional yang akan digelar di salah satu cabangnya. Hotman Paris selaku salah satu pemegang saham HWG Group mengaku bersyukur lantaran acara yang digelarnya mendapat dukungan dari Kementerian Olahraga.",
            "Twitter menunggak uang sewa kantor selama tiga bulan di kantor mereka di kota Boulder, Amerika Serikat. Dampaknya, pegawai Twitter diusir.\n" +
                    "Berdasarkan laporan TechCrunch, dokumen pengadilan menyatakan bahwa hakim di Boulder telah menandatangani surat pengusiran atas Twitter.\n" +
                    "\n" +
                    "Sejak akuisisi oleh Elon Musk, manajemen bisnis dan operasional Twitter menjadi kacau balau sehingga banyak tagihan yang dilaporkan belum dibayar.",
            "Terjangan angin tornado dan angin puting beliung mengakibatkan sejumlah kendaraan rusak dan menumbangkan pepohonan. Cuaca ekstrem yang menerjang negara bagian di Amerika Serikat, yakni California, memakan korban jiwa pada Rabu (22/3/2023) waktu setempat.",
            "Direktur Jenderal Industri Agro Kementerian Perindustrian (Kemenperin), Putu Juli Ardika mengungkapkan bahwa kenaikan harga gula dunia disebabkan oleh kondisi iklim yang terjadi di India saat ini. Sehingga ekspor gula di India itu sendiri mengalami penurunan 50%, dari yang sebelumnya 12 juta ton menjadi 6 juta ton.",
            "Beberapa merek minyak goreng yang selama ini beredar di pasar, ternyata perusahaan pembuatnya diduga terlibat dalam kasus dugaan korupsi minyak goreng.",
            "Kejaksaan Agung (Kejagung) menetapkan 3 perusahaan minyak sawit sebagai tersangka dalam perkara tindak pidana korupsi minyak goreng (migor). Kerugian yang ditanggung negara Rp 6,47 triliun.",
    };

    private static String [] newsDate = {
            "Jumat, 31 Jun 2023\n",
            "Senin, 29 Jan 2023",
            "Selasa, 25 Jul 2023",
            "Rabu, 22 Sep 2023",
            "Kamis, 23 Aug 2023",
            "Minggu, 4 Mar 2020",
            "Senin, 19 Jan 2019",
            "Sabtu, 11 Jul 2020",
            "Minggu, 13 Mar 2021",
            "Kamis, 12 Feb 2022",
    };
    private static int [] newsImage = {
            R.drawable.news1,
            R.drawable.news2,
            R.drawable.news3,
            R.drawable.news4,
            R.drawable.news5,
            R.drawable.news6,
            R.drawable.news7,
            R.drawable.news8,
            R.drawable.news9,
            R.drawable.news10,
    };

    public static ArrayList<News> getListData(){
        ArrayList<News> list = new ArrayList<>();
        for (int position = 0; position < newsTitle.length; position++){
            News news   = new News();
            news.setDate(newsDate[position]);
            news.setName(newsTitle[position]);
            news.setDetail(newsDetail[position]);
            news.setPhoto(newsImage[position]);
            list.add(news);
        }
        return list;
    }
}
