package Tugas;

public class Gorilla extends Binatang implements IKarnivora, IHerbivora{
    private String suara;
    private String warnaBulu;

    public Gorilla(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }
    
    public void displayMakan(){
        System.out.println("Gorila Makan Daging");
        System.out.println("Gorila Juga Makan Tumbuhan");
    }
    
    public void displayBinatang(){
        System.out.println("Gorila Binatang Karnivora dan Herbivora");
    }
    
    public void displayData(){
        System.out.println("Nama Hewan : " + super.getNama());
        System.out.println("Jumlah Kaki : " + super.getJmlKaki());
        System.out.println("Suara : " + this.suara);
        System.out.println("Warna Bulu : " + this.warnaBulu);
    }
}
