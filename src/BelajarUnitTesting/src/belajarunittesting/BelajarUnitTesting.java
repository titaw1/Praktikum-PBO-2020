/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarunittesting;

/**
 *
 * @author tita
 */
public class BelajarUnitTesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PengolahPesan pp = new PengolahPesan();
        pp.setPengirim("Adi");
        pp.setPenerima("Budi");
        pp.setPesan("Halo, apa kabar bro?");
        pp.tampilkanPesan();
        System.out.println("Total Panjang Pesan: "+pp.hitungPanjangPesan());
    }
    
}
