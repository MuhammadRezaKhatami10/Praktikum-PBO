package Tugas;

public class Singa extends Binatang implements IKarnivora{
    private String suara;
    private String warnaBulu;

    public Singa(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }
    
    public void displayMakan(){
        System.out.println("Singa Makan Daging");
    }
    
    public void displayBinatang(){
        System.out.println("Singa Binatang Karnivora");
    }
    
    public void displayData(){
        System.out.println("Nama Hewan : " + super.getNama());
        System.out.println("Jumlah Kaki : " + super.getJmlKaki());
        System.out.println("Suara : " + this.suara);
        System.out.println("Warna Bulu : " + this.warnaBulu);
    }
}
