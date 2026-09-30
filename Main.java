class Barang {
    private String kode_barang;
    private String nama_barang;
    private String status;

    public Barang(String kode_barang, String nama_barang, String status) {
        this.kode_barang = kode_barang;
        this.nama_barang = nama_barang;
        this.status = status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return this.status;
    }

    public String getNamaBarang() {
        return this.nama_barang;
    }

    public String getKodeBarang() {
        return this.kode_barang;
    }

    public String setNamaBarang(String nama_barang) {
        return this.nama_barang;
    }

    public void setKodeBarang(String kode_barang) {
        this.kode_barang = kode_barang;
    }

    public void tandaiRusak() {
        this.status = "Rusak";
    }

    public void tandaiHilang() {
        this.status = "Hilang";
    }

    public void perbaiki() {
        this.status = "Bagus";
    }
}

class Lokasi {
    private String kode_lokasi;
    private String nama_lokasi;

    public Lokasi(String kode_lokasi, String nama_lokasi) {
        this.kode_lokasi = kode_lokasi;
        this.nama_lokasi = nama_lokasi;
    }

    public String getKodeLokasi() {
        return this.kode_lokasi;
    }

    public String getNamaLokasi() {
        return this.nama_lokasi;
    }

    public void setKodeLokasi(String kode_lokasi) {
        this.kode_lokasi = kode_lokasi;
    }

    public void setNamaLokasi(String nama_lokasi) {
        this.nama_lokasi = nama_lokasi;
    }
}

class PencatatanInventaris {
    private static int nextNumber = 1;
    private int kode_pencatatan;
    private Barang barang;
    private Lokasi lokasi;

    public PencatatanInventaris(Barang barang, Lokasi lokasi) {
        this.kode_pencatatan = nextNumber++;
        this.barang = barang;
        this.lokasi = lokasi;
    }

    public String getNamaBarang() {
        return this.barang.getNamaBarang();
    }

    public String getKodeBarang() {
        return this.barang.getKodeBarang();
    }

    public Barang getBarang(){
        return this.barang;
    }

    public String getStatusBarang() {
        return this.barang.getStatus();
    }

    public String getKodeLokasiBarang() {
        return this.lokasi.getKodeLokasi();
    }

    public String getLokasiBarang() {
        return this.lokasi.getNamaLokasi();
    }

    public int getKodePencatatan() {
        return this.kode_pencatatan;
    }
}

public class Main {
    public static void main(String[] args) {
        Barang kursi = new Barang("BR001", "Kursi", "Bagus");
        Barang meja = new Barang("BR002", "Meja", "Bagus");
        Lokasi rsg = new Lokasi("LK001", "RSG JTK");
        Lokasi kelas = new Lokasi("LK002", "Kelas D101");

        PencatatanInventaris peminjamanKursi = new PencatatanInventaris(kursi, rsg);
        PencatatanInventaris peminjamanMeja = new PencatatanInventaris(meja, kelas);
        System.out.println("PROGRAM INVENTARIS BARANG KAMPUS");

        System.out.println("PEMINJAMAN PERTAMA:");
        System.out.println("Kode Pencatatan: " + peminjamanKursi.getKodePencatatan());
        System.out.println("Kode Barang: " + peminjamanKursi.getKodeBarang());
        System.out.println("Nama Barang: " + peminjamanKursi.getBarang().getNamaBarang());
        System.out.println("Status Barang: " + peminjamanKursi.getStatusBarang());
        System.out.println("Kode Lokasi Barang: " + peminjamanKursi.getKodeLokasiBarang());
        System.out.println("Lokasi Barang: " + peminjamanKursi.getLokasiBarang());

        System.out.println();

        System.out.println("PEMINJAMAN KEDUA:");
        System.out.println("Kode Pencatatan: " + peminjamanMeja.getKodePencatatan());
        System.out.println("Kode Barang: " + peminjamanMeja.getKodeBarang());
        System.out.println("Nama Barang: " + peminjamanMeja.getNamaBarang());
        System.out.println("Status Barang: " + peminjamanMeja.getStatusBarang());
        System.out.println("Kode Lokasi Barang: " + peminjamanMeja.getKodeLokasiBarang());
        System.out.println("Lokasi Barang: " + peminjamanMeja.getLokasiBarang());

        System.out.println();
        System.out.println("Status " + kursi.getNamaBarang() + " sebelum tandaiRusak: " + kursi.getStatus());
        kursi.tandaiRusak();
        System.out.println("Status " + kursi.getNamaBarang() + " setelah tandaiRusak: " + kursi.getStatus());
        

    }
}