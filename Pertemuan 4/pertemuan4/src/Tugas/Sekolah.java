package Tugas;

public class Sekolah {
    public Teman[] arrayTeman;
    private OrangTua ayah, ibu;

    public Sekolah(int jumlah, OrangTua ayah, OrangTua ibu) {
        this.arrayTeman = new Teman[jumlah];
        this.ayah = ayah;
        this.ibu = ibu;
        this.iniTeman();
    }

    public Teman[] getArrayTeman() {
        return arrayTeman;
    }
    
    public void setTeman(String nama){
        for (int i = 0; i < arrayTeman.length; i++){
            if (arrayTeman[i].getNama() == null){
                arrayTeman[i].setNama(nama);
                break;
            }
        }
    }
    
    private void iniTeman(){
        for (int i = 0; i < arrayTeman.length; i++){
            this.arrayTeman[i] = new Teman();
        }
    }
    
    public void setAnak(Anak anak, int umur){
        this.arrayTeman[umur - 1].setAnak(anak);
    }
    
    public String info(){
        String info ="";
        info += "Ayah   : " + this.ayah.info();
        info += "Ibu    : " + this.ibu.info();
        info += "\n........................\n";
        for (Teman teman : arrayTeman){
            info += teman.info();
        }
        return info;
    }
}
