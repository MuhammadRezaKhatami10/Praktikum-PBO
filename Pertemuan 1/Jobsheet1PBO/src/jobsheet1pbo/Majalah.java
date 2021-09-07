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
public class Majalah extends Buku {
    private String judul;
    
    public void setJudul(String newValue){
        judul = newValue;
    }
    
    public void cekStatus(){
    super.cekStatus();
        System.out.println("Judul : " + judul);
    }
}
