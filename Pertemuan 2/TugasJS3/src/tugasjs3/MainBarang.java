package tugasjs3;

public class MainBarang {

    public static void main(String[] args) {
        Barang brg1 = new Barang();
        brg1.namaBarang = "HandPhone";
        brg1.kode = "A51";
        brg1.hargaDasar = 2500000;
        brg1.diskon = 20;
        brg1.tampilData();
    }
}
