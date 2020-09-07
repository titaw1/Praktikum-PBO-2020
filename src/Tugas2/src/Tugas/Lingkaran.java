/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author tita
 */
public class Lingkaran {
    public double phi;
    public double r;
    
    public double hitungLuas(double jari2){
        phi = 3.14;
        r = jari2;
        double luas = phi*jari2*jari2;
        return luas;
    }
    public double hitungKeliling(double jari2){
        phi = 3.14;
        r = jari2;
        double keliling = 2*phi*jari2;
        return keliling;
    }
// untuk test    
//    public static void main(String[] args) {
//        Lingkaran r = new Lingkaran();
//        System.out.println("Luas Lingkaran : "+r.hitungLuas(18));
//        System.out.println("Keliling Lingkaran : "+r.hitungKeliling(23));
//    }
}
