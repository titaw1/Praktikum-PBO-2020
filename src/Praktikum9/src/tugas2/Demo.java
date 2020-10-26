/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author tita
 */
public class Demo {
    public static void main(String[] args) {
        Manusia m1 = new Manusia();      
        Dosen d1 = new Dosen();       
        Mahasiswa m = new Mahasiswa();
        
        Manusia dmd; //dynamic method dispatch
        System.out.println("-----Cetak data manusia-----");
        dmd=m1;
        dmd.makan();
        dmd.bernafas();
        System.out.println("------Cetak data dosen------");
        dmd=d1;
        dmd.makan();
        d1.lembur();
        System.out.println("----------------------------");
        System.out.println("----Cetak data mahasiswa----");
        dmd=m;
        dmd.makan();
        m.tidur();
        System.out.println("----------------------------");
    }
}
