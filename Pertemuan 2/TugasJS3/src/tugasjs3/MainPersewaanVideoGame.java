package tugasjs3;

public class MainPersewaanVideoGame {
    public static void main(String[] args) {
        PersewaanVideoGame p1 = new PersewaanVideoGame();
        p1.id = "2041720076";
        p1.namaMember = "Khatami";
        p1.namaGame = "PES 2021";
        p1.lamaSewa = 3;
        p1.harga = 25000;
        p1.tampilDataPeminjaman();
        p1.tampilHargaBayar();
    }
}
