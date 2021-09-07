/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jobsheet1pbo;

/**
 *
 * @author boy
 */
public class BukuDemo {
    public static void main(String[] args) {
        
        Buku bk1 = new Buku();
        Buku bk2 = new Buku();
        Majalah bk3 = new Majalah();
        Kamus bk4 = new Kamus();
        
        bk1.setMerek("Sidu");
        bk1.gantiJumHal(32);
        bk1.TambahJumHal(10);
        bk1.setWarna("Kuning");
        bk1.cekStatus();
        
        bk2.setMerek("deli");
        bk2.gantiJumHal(64);
        bk2.KurangJumHal(4);
        bk2.setWarna("Hitam");
        bk2.cekStatus();
        
        bk3.setMerek("Mimbar");
        bk3.gantiJumHal(30);
        bk3.TambahJumHal(5);
        bk3.KurangJumHal(2);
        bk3.setWarna("Hitam");
        bk3.setJudul("Haji Mabrur ");
        bk3.cekStatus();
        
        bk4.setMerek("Gramedia");
        bk4.gantiJumHal(400);
        bk4.TambahJumHal(2);
        bk4.setWarna("Biru");
        bk4.setBahasa("Inggris-Indonesia");
        bk4.cekStatus();
    }
}
