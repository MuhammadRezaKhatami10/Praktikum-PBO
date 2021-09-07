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
public class Kamus extends Buku{
    private String bahasa;
    
    public void setBahasa (String newValue) {
         bahasa = newValue;
    }
    
    public void cekStatus(){
    super.cekStatus();
        System.out.println("Bahasa : " + bahasa);
    }
}
