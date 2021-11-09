package Tugas;

public class Keledai extends Binatang implements IHerbivora{
    private String suara;
    private String warnaBulu;

    public Keledai(String nama, int jmlKaki ,String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }
    
    public void displayMakan(){
        System.out.println("Keledai Makan Tumbuhan");
    }
    
    public void displayBinatang(){
        System.out.println("Keledai Binatang Herbivora");
    }
    
    public void displayData(){
        System.out.println("Nama Hewan : " + super.getNama());
        System.out.println("Jumlah Kaki : " + super.getJmlKaki());
        System.out.println("Suara : " + this.suara);
        System.out.println("Warna Bulu : " + this.warnaBulu);
    }
}
