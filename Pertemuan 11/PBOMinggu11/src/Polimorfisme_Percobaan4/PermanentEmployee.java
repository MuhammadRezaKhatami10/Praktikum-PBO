/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Polimorfisme_Percobaan4;

import Polimorfisme_Percobaan2.*;
import Polimorfisme.*;

/**
 *
 * @author boy
 */
public class PermanentEmployee extends Employee implements Payable{
    private int gaji;

    public PermanentEmployee(String name, int gaji) {
        this.name = name;
        this.gaji = gaji;
    }

    public int getGaji() {
        return gaji;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }
    
    
    @Override
    public int getPaymentAmount() {
        return (int) (gaji+0.05*gaji);
    }
    
    @Override
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo();
        info += " terdaftar sebagai karyawan tetep dengan gaji " + gaji + "\n";
        return info;
    }    
    
}
