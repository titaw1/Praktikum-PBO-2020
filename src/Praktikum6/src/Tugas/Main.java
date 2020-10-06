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
public class Main {
    public static void main(String[] args) {
        Dosen d1 = new Dosen("1234", "Citra", "Pasuruan");
        d1.setJumlahSKS(3);
        d1.setTARIF_SKS(100000);
        
        Pegawai p1 = new Pegawai("4321", "Annisa", "Pandaan");
        
        DaftarGaji dg = new DaftarGaji(2);
        dg.addPegawai(d1);
        dg.addPegawai(p1);
        dg.printSemuaGaji();
        
    }
}
