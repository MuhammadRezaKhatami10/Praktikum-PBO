/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Polimorfisme_Percobaan2;

import Polimorfisme.*;

/**
 *
 * @author boy
 */
public class InternshipEmployee extends Employee{
    private int length;

    public InternshipEmployee(String nama, int length) {
        this.length = length;
        super.name = nama;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    
    @Override
    public String getEmployeeInfo(){
        String info = super.getEmployeeInfo();
        info += " terdaftar sebagai karyawan magang selama " + length + "bulan/s\n";
        return info;
    }
    
}
