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
public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;
    
    public int hitungHargaJual(){
    return (int) (hargaDasar-((diskon/100)*hargaDasar));
    }
    public void tampilData(){
        System.out.println("Kode : "+kode);
        System.out.println("Nama Barang : "+namaBarang);
        System.out.println("Harga Dasar : Rp"+hargaDasar);
        System.out.println("Diskon : "+diskon+"%");
        System.out.println("Harga Jual : Rp"+hitungHargaJual());
        System.out.println("-------------------------------------");
    }
// untuk test    
//    public static void main(String[] args) {
//        Barang b = new Barang();
//        Barang b1 = new Barang();
//        b.kode = "tu12";
//        b.namaBarang="kursi";
//        b.hargaDasar=122000;
//        b.diskon=20;
//        b.tampilData();
//        
//        b1.kode = "ta89";
//        b1.namaBarang="Papan Tulis";
//        b1.hargaDasar=155000;
//        b1.diskon=18;
//        b1.tampilData();
//    }
}
