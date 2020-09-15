/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author tita
 */
public class Anggota {
    public String ktp;
    public String nama;
    public int limitPinjaman;
    public int pinjaman;
    
    Anggota (String ktp, String nama, int limitPinjaman){
        this.ktp = ktp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }
    public String getNama(){
        return nama;
    }
    public int getLimitPinjaman(){
        return limitPinjaman;
    }
    public void pinjam(int uang){
        if(uang>limitPinjaman){
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        }else {
            pinjaman += uang;
        }
    }
    public void angsur(int uang){
        if(uang>=(pinjaman*10/100)){
            pinjaman -= uang;
        }
        else{
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }
    }
    public int getJumlahPinjaman(){
        return pinjaman;
    }
    
}
