package kasus_sebelumnya.Model;

public class Minuman extends MenuItem {
    private String jenisMinuman;

    public Minuman(String kode, String nama, int harga, String jenisMinuman) {
        super(kode, nama, harga);
        this.jenisMinuman = jenisMinuman;
    }

    public String getJenisMinuman() {
        return jenisMinuman;
    }

    @Override
    public String toString() {
        return "Minuman[" +
                super.toString() +
                ", jenis=" + jenisMinuman + "]";
    }
}