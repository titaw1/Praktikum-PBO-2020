/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author tita
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        sepatu sd1 = new sepatu();
        sepatu sd2 = new sepatu();
        SepatuRoda ss3 = new SepatuRoda();
        
        lemari l4 = new lemari();
        lemari l5 = new lemari();
        
        rok r6 = new rok();
        rok r7 = new rok();
        
        sd1.setMerk("Adidas");
        sd1.setWarna("Merah");
        sd1.ukuran(36);
        sd1.cetakStatus();
        System.out.println("-------------------------");
        
        sd2.setMerk("Star");
        sd2.setWarna("Putih");
        sd2.ukuran(34);
        sd2.cetakStatus();
        System.out.println("-------------------------");
        
        ss3.setMerk("Fila");
        ss3.setWarna("Tosca");
        ss3.ukuran(38);
        ss3.jumlahRoda(8);
        ss3.cetakStatus();
        System.out.println("-------------------------");
        
        l4.setBahan("Kayu Mahoni");
        l4.setWarna("Coklat");
        l4.hitungVolume(150, 95, 180);
        l4.cetakStatus();
        System.out.println("-------------------------");
        
        l5.setBahan("Kayu Jati");
        l5.setWarna("Hitam");
        l4.hitungVolume(100, 85, 175);
        l4.cetakStatus();
        System.out.println("-------------------------");
        
        r6.setbahan("Scuba");
        r6.setModel("Span");
        r6.setpanjang(68);
        r6.setlingkar(47);
        r6.cetakStatus();
        System.out.println("-------------------------");
        
        r7.setbahan("Sifon");
        r7.setModel("Payung");
        r7.setpanjang(81);
        r7.setlingkar(69);
        r7.cetakStatus();
        System.out.println("-------------------------");
    }
    
}
