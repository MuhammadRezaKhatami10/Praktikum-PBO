package Tugas;

public class Teman {
    private String nama;
    public Anak anak;

    public Teman() {
    }

    
    public Teman(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Anak getAnak() {
        return anak;
    }

    public void setAnak(Anak anak) {
        this.anak = anak;
    }
    
    public String info(){
        String info="";
        info += "Nama Teman : " + nama + "\n";
        if (this.anak != null){
            info += "Nama Anak : "+ anak.info() + "\n";
        }
        return info;
    }
}
