/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package frontend;

import backend.Anggota;

public class TestAnggota {

    public static void main(String[] args) {
        Anggota ag1 = new Anggota("Arya Admaja", "Balikpapan", "085123456789");
        Anggota ag2 = new Anggota("Alfinza Sanjaya", "Singosari", "082654432111");
        Anggota ag3 = new Anggota("Dwihardik Kusuma", "Suhat", "085222345678");
        Anggota ag4 = new Anggota("Jud Amal", "Dau", "082156675134");

        // test insert
        ag1.save();
        ag2.save();
        ag3.save();
        ag4.save();

        // test update
        ag3.setAlamat("Politeknik Negeri Malang");
        ag3.save();

        // test delete
        ag4.delete();

        // test select all
        for (Anggota a : new Anggota().getAll()) {
            System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat() + ", Telepon: " + a.getTelepon());
        }

        // test search
        for (Anggota a : new Anggota().search("ilmiah")) {
            System.out.println("Nama: " + a.getNama() + ", Alamat: " + a.getAlamat() + ", Telepon: " + a.getTelepon());
        }
    }
}
