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
public class MobilDemo {
    public static void main(String[] args) {
        
        Mobil mbl1 = new Mobil();
        Mobil mbl2 = new Mobil();
        
        mbl1.setMerek("Toyota");
        mbl1.setType("Manual");
        mbl1.pindahGigi(2);
        mbl1.kecepatan(40);
        mbl1.tambahKecepatan(5);
        mbl1.tambahKecepatan(5);
        mbl1.cekStatus();
        
        mbl2.setMerek("Daihatsu");
        mbl2.setType("Matic");
        mbl2.pindahGigi(2);
        mbl2.kecepatan(30);
        mbl2.kurangKecepatan(5);
        mbl2.tambahKecepatan(2);
        mbl2.kurangKecepatan(2);
        mbl2.cekStatus();
    }
}
