package Tugas_15;

public class MainTugas_15 {
    
    public static void main(String[] args) {
        Pegawai_15 pg1 = new Pegawai_15("111", "Reza", "Malang");
        Dosen_15 ds1 = new Dosen_15("222", "Khatami", "Malang");
        ds1.setSKS(3);
        DaftarGaji_15 gaji = new DaftarGaji_15(2);
        gaji.addPegawai(pg1);
        gaji.addPegawai(ds1);
        gaji.printSemuaGaji();
    }
}
