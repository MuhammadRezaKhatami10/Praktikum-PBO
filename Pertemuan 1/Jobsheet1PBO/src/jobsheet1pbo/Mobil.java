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
public class Mobil {
    private String merek, type;
    private int gigi, kecepatan;
    
    public void setMerek (String newValue){
        merek = newValue;
    } 
    
    public void setType (String newValue){
        type = newValue;
    }
    
    public void pindahGigi (int newValue){
        gigi = newValue;
    }
    
    public void kecepatan (int newValue){
        kecepatan = newValue;
    }
    
    public void tambahKecepatan (int increment){
        kecepatan += increment;
    }
    
    public void kurangKecepatan (int decrement){
        kecepatan -= decrement;
    }
    
    public void cekStatus(){
        System.out.println("Merek : " + merek);
        System.out.println("Type : " + type);
        System.out.println("Gigi : " + gigi);
        System.out.println("Kecepatan : " + kecepatan);       
    }
}
