package kasus_sebelumnya.Model;

public class Makanan extends MenuItem {
    private String jenisMakanan;

    public Makanan(String kode, String nama, int harga, String jenisMakanan) {
        super(kode, nama, harga);
        this.jenisMakanan = jenisMakanan;
    }

    public String getJenisMakanan() {
        return jenisMakanan;
    }

    @Override
    public String toString() {
        return "Makanan[" +
                super.toString() +
                ", jenis=" + jenisMakanan + "]";
    }
}