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
public class Peminjaman {
    public int id;
    public String namaMember;
    public String namaGame;
    public int lamaWaktu;
    public int harga;
    
    public void setId(int i){
        id = i;
    }
    public void setNama(String nama){
        namaMember = nama;
    }
    public void setNamaGame(String game){
        namaGame = game;
    }
    public int hitungHarga(int lw, int hrg){
        lamaWaktu = lw;
        harga = hrg;
        harga = lw*hrg;
        return harga;
    }
    public void cetakData(){
        System.out.println("==================");
        System.out.println(" Data Peminjaman");
        System.out.println("==================");
        System.out.println("Id Peminjam : "+id);
        System.out.println("Nama Peminjam : "+namaMember);
        System.out.println("Nama Game : "+namaGame);
        System.out.println("Harga yang harus dibayar : "+harga);
    }
// untuk test
//    public static void main(String[] args) {
//        Peminjaman p = new Peminjaman();
//        p.setId(1352);
//        p.setNama("Tita Wijayanti");
//        p.setNamaGame("Bounce");
//        p.hitungHarga(2, 15000);
//        p.cetakData();
//    }
}
