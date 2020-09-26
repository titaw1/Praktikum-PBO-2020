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
public class Barang {
    public String nama;
    public int harga;
    
    public Barang(){
        
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setHarga(int harga){
        this.harga = harga;
    }
    public int getHarga(){
        return harga;
    }
    public int totalHarga(int jumlah){
        return harga*jumlah;
    }
    public String cetakData(){
        String cetakData = "";
        cetakData += ("Nama Barang \t\t : "+this.nama+"\n");
        return cetakData;
    }
}
