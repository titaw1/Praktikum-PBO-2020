/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hirarki;

/**
 *
 * @author tita
 */
public class Pertemuan7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kubus k = new Kubus("Kubus", 98, 0, 0, 0, 0);
        k.hitungVolume();
        
        Bola b = new Bola("Bola", 0, 0, 0, 0, 6);
        b.hitungVolume();
        
        Balok blk = new Balok("Balok", 0, 13, 8, 11, 0);
        blk.hitungVolume();
        
        Limas l = new Limas("Limas", 0, 6, 3, 7, 0);
        l.hitungVolume();
        
        Kerucut kr = new Kerucut("Kerucut", 0, 0, 0, 17, 23);
        kr.hitungVolume();
    }
    
}
