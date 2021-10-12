package Tugas;

public class Anak {
    public String nama, jenkel;
    private OrangTua Orangtua;

    public Anak(String nama, String jenkel) {
        this.nama = nama;
        this.jenkel = jenkel;
    }

    public Anak(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenkel() {
        return jenkel;
    }

    public void setJenkel(String jenkel) {
        this.jenkel = jenkel;
    }
    
    public String info(){
        String info ="";
        info += nama + "\n";
        info += this.jenkel + "\n";
        return info;
    }
}
