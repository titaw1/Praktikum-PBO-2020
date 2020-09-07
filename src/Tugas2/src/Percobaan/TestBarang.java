/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Percobaan;

/**
 *
 * @author tita
 */
public class TestBarang {
    public static void main(String[] args) {
        Barang brg1 = new Barang();
        brg1.namaBrg = "Pensil";
        brg1.jenisBrg = "ATK";
        brg1.stok = 10;
        brg1.tampilBarang();
        System.out.println("Stok Baru Adalah "+brg1.tambahStok(20));
    }
}
