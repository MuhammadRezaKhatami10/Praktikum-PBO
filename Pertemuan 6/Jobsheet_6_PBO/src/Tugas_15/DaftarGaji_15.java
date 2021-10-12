package Tugas_15;

public class DaftarGaji_15 {
    private Pegawai_15[] listPegawai;

    public DaftarGaji_15(int listPegawai) {
        this.listPegawai = new Pegawai_15[listPegawai];
        this.initlistPegawai();
    }
    
    private void initlistPegawai(){
        for (int i = 0; i < this.listPegawai.length; i++) {
            this.listPegawai[i]= new Pegawai_15(null, null, null);
        }
    }
    
    public void addPegawai(Pegawai_15 listPegawai){
        for (int i = 0; i < this.listPegawai.length; i++) {
            if (this.listPegawai[i].getNama() == null){
                this.listPegawai[i] = listPegawai;
                break;
            }
        }
    }
    
    public void printSemuaGaji(){
        for (int i = 0; i < this.listPegawai.length; i++) {
            if (this.listPegawai[i].getNama() != null){
                System.out.println("Nama    : " + listPegawai[i].getNama());
                System.out.println("Gaji    : " + listPegawai[i].getGaji() + "\n");
            }
        }
    }
}
