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
public class Buku {
    private String merek;
    private String warna;
    private int jumlahHal;
    
    public void setMerek (String newValue) {
        merek = newValue;
    }
    
    public void gantiJumHal (int newValue) {
        jumlahHal = newValue;
    }
    
    public void setWarna (String newValue) {
        warna = newValue;
    }
    
    public void TambahJumHal (int increment){
        jumlahHal = jumlahHal + increment;
    }
    
    public void KurangJumHal (int decrement){
        jumlahHal = jumlahHal - decrement;
    }
    
    public void cekStatus() {
        System.out.println("Merek : " + merek);
        System.out.println("Jumlah Halaman : " + jumlahHal);
        System.out.println("Warna : " + warna);
    }
    
}
