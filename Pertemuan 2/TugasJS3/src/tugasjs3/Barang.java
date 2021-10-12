package tugasjs3;

public class Barang {

    public String kode, namaBarang;
    public int hargaDasar;
    public float diskon;

    public void tampilData() {
        System.out.println("----------------------------------------------");
        System.out.println("----------------TAMPIL DATA BARANG------------");
        System.out.println("----------------------------------------------");
        System.out.println("Kode        : " + kode);
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga Dasar : Rp." + hargaDasar);
        System.out.println("Diskon      : " + diskon + "%");
        System.out.println("Total Bayar : " + hitungHargaJual());
        System.out.println("----------------------------------------------");
    }

    public int hitungHargaJual() {
        diskon = diskon / 100;
        return (int) (hargaDasar - (diskon * hargaDasar));
    }
}
