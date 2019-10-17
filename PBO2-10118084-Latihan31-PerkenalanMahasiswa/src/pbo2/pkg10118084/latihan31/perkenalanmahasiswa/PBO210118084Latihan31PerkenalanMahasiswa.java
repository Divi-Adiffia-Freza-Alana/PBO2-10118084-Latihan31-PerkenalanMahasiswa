/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan31.perkenalanmahasiswa;

/**
 *
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuk menampilkan Perkenalan mahasiswa

 */
public class PBO210118084Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa Mahasiswa1 = new Mahasiswa();
        Mahasiswa1.nim="10110269";
        Mahasiswa1.nama="Rizki Adam Kurniawan";
        Mahasiswa1.perkenalanDiri(Mahasiswa1.nim,Mahasiswa1.nama);
        
        Mahasiswa Mahasiswa2 = new Mahasiswa();
        Mahasiswa2.nim="10110270";
        Mahasiswa2.nama="Indra Tiola";
        Mahasiswa2.perkenalanDiri(Mahasiswa2.nim,Mahasiswa2.nama);
        
        Mahasiswa Mahasiswa3 = new Mahasiswa();
        Mahasiswa3.nim="10110271";
        Mahasiswa3.nama="Robi Tanzil Ganefi";
        Mahasiswa3.perkenalanDiri(Mahasiswa3.nim,Mahasiswa3.nama);
        
        Mahasiswa Mahasiswa4 = new Mahasiswa();
        Mahasiswa4.nim="10110271";
        Mahasiswa4.nama="Muhammad Nur Awaluddin";
        Mahasiswa4.perkenalanDiri(Mahasiswa4.nim,Mahasiswa4.nama);
    }
    
}
