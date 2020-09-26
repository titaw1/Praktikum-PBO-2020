/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;

/**
 *
 * @author tita
 */
public class Pembeli {
    public String nama;
    public String alamat;
    public Barang barang;
    private int jumlah;
    
    public Pembeli(){
        
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    public String setAlamat(){
        return alamat;
    }
    public void setBarang(Barang barang){
        this.barang = barang;
    }
    public Barang getBarang(){
        return barang;
    }
    public String cetakData(){
        String cetakData = "";
        cetakData += ("Nama Pembeli/Penerima \t : "+this.nama+"\n");
        cetakData += ("Alamat \t\t\t : "+this.alamat+"\n");
        cetakData += (this.barang.cetakData()+"\n");
        return cetakData;
    }
}
