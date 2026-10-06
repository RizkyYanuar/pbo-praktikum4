package kasus_sebelumnya.App;

import kasus_sebelumnya.Model.DataMahasiswa;
import kasus_sebelumnya.Model.Pesanan;
import kasus_sebelumnya.Model.Makanan;
import kasus_sebelumnya.Model.Minuman;

public class Mahasiswa {
    public static void main(String[] args) {
        DataMahasiswa m1 = new DataMahasiswa("251511029", "Rizky Yanuar Irawan");
        DataMahasiswa m2 = new DataMahasiswa("251511030", "Kareem Nul Mustofa");
        DataMahasiswa m3 = new DataMahasiswa("251511031", "Rizal Abdul Kaifa");

        System.out.println("Nama: " + m1.getNama() + ", NIM: " + m1.getNim());
        System.out.println("Nama: " + m2.getNama() + ", NIM: " + m2.getNim());

        // TAHAP 2

        Makanan nasi = new Makanan(
                "M01",
                "Nasi Goreng",
                18000,
                "Makanan Utama");

        Minuman kopi = new Minuman(
                "M02",
                "Kopi Susu",
                12000,
                "Kopi");

        Minuman matcha = new Minuman(
                "M03",
                "Matcha Latte",
                25000,
                "Latte Series");

        Pesanan p1 = new Pesanan(m1, nasi, 2);
        Pesanan p2 = new Pesanan(m2, kopi, 1);
        Pesanan p3 = new Pesanan(m3, matcha, 1);

        System.out.println("P1 dapat diproses: " + p1.dapatDiproses());
        System.out.println("Total P1: " + p1.hitungTotal());
        System.out.println("P2 dapat diproses: " + p2.dapatDiproses());

        System.out.println(nasi.getNama() + " tersedia: " + nasi.isTersedia());
        System.out.println(kopi.getNama() + " tersedia: " + kopi.isTersedia());
        System.out.println(kopi.getNama() + " tersedia: " + kopi.isTersedia());

        System.out.println("Pemesan Pertama: " + p1.getNama());
        System.out.println("Pemesan Kedua: " + p2.getNama());
        System.out.println("Nomor pesanan pertama: " + p1.getNomor());
        System.out.println("Nomor pesanan kedua: " + p2.getNomor());
        System.out.println("Nomor pesanan ketiga: " + p3.getNomor());
        System.out.println("Jumlah pesanan dibuat: " + Pesanan.getJumlahPesananDibuat());

        System.out.println(nasi);
        System.out.println(kopi);
        System.out.println(matcha);

    }
}