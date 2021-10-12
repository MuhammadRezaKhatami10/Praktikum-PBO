package TugasJS3;

import java.util.Scanner;

public class TestKoperasi {

    public static void main(String[] args) {
        Scanner reza = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
        System.out.println("\nMeminjam uang 10.000.000...");
        System.out.print("Masukkan Jumlah Pinjaman : " );
        donny.pinjam(reza.nextInt());
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.println("\nMeminjam uang 4.000.000...");
        System.out.print("Masukkan Jumlah Pinjaman : " );
        donny.pinjam(reza.nextInt());
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.println("\nMembayar angsuran 1.000.000");
        System.out.print("Masukkan Jumlah Angsuran : " );
        donny.angsur(reza.nextInt());
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.println("\nMembayar angsuran 3.000.000");
        System.out.print("Masukkan Jumlah Angsuran : " );
        donny.angsur(reza.nextInt());
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
    }
}
