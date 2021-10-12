package Tugas_15;

public class Dosen_15 extends Pegawai_15{
    
    private int jumlahSKS;
    private int TARIF_SKS;
    
    public Dosen_15(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public void setSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }
    
    public int getGaji(){
      TARIF_SKS = 300000;
      int gaji_SKS = jumlahSKS * TARIF_SKS;
      return super.getGaji() + gaji_SKS;
    }   
}
