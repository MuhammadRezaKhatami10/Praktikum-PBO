/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Polimorfisme_Percobaan3;

/**
 *
 * @author boy
 */
public class Tester3 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        ElectricityBill eBill = new ElectricityBill(5, "R-1");
        Employee e[] = {pEmp, iEmp};
        Payable p[] = {pEmp, eBill};
        Employee e2[] = {pEmp, iEmp, eBill};
        //eror karena eBill atau class  ElectricityBill tidak meng extends Employee
    }
}
