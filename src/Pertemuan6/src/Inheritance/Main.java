/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author tita
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BangunDatar bd1 = new BangunDatar();
        Segitiga s1 = new Segitiga();
        s1.alas=33;
        s1.tinggi=8;
        
        Lingkaran l1 = new Lingkaran();
        l1.r=15;
        
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.panjang=53;
        pp1.lebar=27;
        
        bd1.luas();
        bd1.keliling();
        
        s1.luas();
        s1.keliling();
        
        l1.luas();
        l1.keliling();
        
        pp1.luas();
        pp1.keliling();
        
        
        
    }
    
}
