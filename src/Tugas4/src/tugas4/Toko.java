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
public class Toko {
    public String nama;
    public String alamat;
    public JasaKirim jasaKirim; 
    
    public Toko(){

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
    public String getAlaamt(){
        return alamat;
    }
    public void setJasaKirim(JasaKirim jasaKirim){
        this.jasaKirim = jasaKirim;
    }
    public JasaKirim getJasaKirim(){
        return jasaKirim;
    }
    public String cetakData(){
        String cetakData = "";
        cetakData += ("Nama Toko/Pengirim \t : "+this.nama+"\n");
        cetakData += ("Alamat Toko \t\t : "+this.alamat+"\n");
        cetakData += ("Nama Jasa Kirim \t : "+this.jasaKirim.getNama()+"\n");
        cetakData += ("Ongkos Kirim \t\t : "+this.jasaKirim.getHarga()+"\n");
        cetakData += ("Resi \t\t\t : "+this.jasaKirim.getResi()+"\n");
        return cetakData;
    }
    
}
