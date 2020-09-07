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
    
    public double hitungLuas(){
        double luas = phi*r*r;
        return luas;
    }
    public double hitungKeliling(){
        double keliling = 2*phi*r;
        return keliling;
    }
// untuk test    
//    public static void main(String[] args) {
//        Lingkaran r = new Lingkaran();
//        r.phi=3.14;
//        r.r=18;
//        System.out.println("Luas Lingkaran : "+r.hitungLuas());
//        System.out.println("Keliling Lingkaran : "+r.hitungKeliling());
//    }
}
