package Tugas;

public class OrangTua {
    private String nama;
    private int umur;

    public OrangTua() {
    }

    public OrangTua(String Nama, int umur) {
        this.nama = Nama;
        this.umur = umur;
    }

    public void OrangTua(String nama) {
        this.nama = nama;
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String Nama) {
        this.nama = Nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        return info;
    }    
    
}
