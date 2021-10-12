package Percobaan4;

public class MainP4 {

    public static void main(String[] args) {
        Penumpang andi = new Penumpang("12345", "Andi");
        Penumpang budi = new Penumpang("67890", "Budi");
        Gerbong gerbong = new Gerbong("A", 10);
        gerbong.setPenumpang(andi, 1);
        gerbong.setPenumpang(budi, 1);
        System.out.println(gerbong.info());
    }
}
