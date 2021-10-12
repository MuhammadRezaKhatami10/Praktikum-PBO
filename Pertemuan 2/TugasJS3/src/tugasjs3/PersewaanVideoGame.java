package tugasjs3;

public class PersewaanVideoGame {
    public String id;
    public String namaMember;
    public String namaGame;
    public int harga, lamaSewa;
    
    public void tampilDataPeminjaman(){
        System.out.println("----------------------------------------------");
        System.out.println("------------PERSEWAAN VIDEO GAME REZA---------");
        System.out.println("----------------------------------------------");
        System.out.println("ID Member   : " +id);
        System.out.println("Nama Member : " +namaMember);
        System.out.println("Nama Game   : " +namaGame);
        System.out.println("Lama Sewa   : " +lamaSewa);
        System.out.println("Harga       : " +harga);
        System.out.println("-----------------------------------------------");
        System.out.println("===============================================");        
    }
    
    public void tampilHargaBayar(){
        System.out.println("Total : " + harga * lamaSewa);
    }
}
