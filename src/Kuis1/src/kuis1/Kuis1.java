/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1;

/**
 *
 * @author tita
 */
public class Kuis1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manusia m = new Manusia(21, "Ani", true);
        Manusia m1 = new Manusia(30, "Arin", true); 
        Manusia m2 = new Manusia(5, "Titin", false);
        Manusia m3 = new Manusia(25, "Nanda", true);
        Manusia m4 = new Manusia (18, "Ilham", false);
        Manusia m5 = new Manusia (35, "Rizal", true);
        System.out.println("---Perempuan umur < 22---");
        Wanita w = new Wanita();
        w.setManusia(m);
        System.out.println(w.info());
        Wanita w1 = new Wanita();
        w1.setManusia(m1);
        Wanita w2 = new Wanita();
        w2.setManusia(m2);
        System.out.println("---Pria umur > 22---");
        Pria p = new Pria();
        p.setManusia(m3);
        p.setIstri(w1);
        System.out.println(p.info());
        System.out.println("---Pria umur < 22---");
        Pria p1 = new Pria();
        p1.setManusia(m4);
        System.out.println(p1.info());
        Pria p2 = new Pria();
        p2.setManusia(m5);
        
        System.out.println("---Perempuan umur > 22 tahun---");
        w1.setAnak(m2);
        w1.setSuami(p2);
        System.out.println(w1.info());
        
    }
    
}
