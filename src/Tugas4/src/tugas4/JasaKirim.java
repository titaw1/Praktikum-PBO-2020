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
public class JasaKirim {
    public String nama;
    public int resi;
    public int harga;
    
    public JasaKirim(){
        
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setResi(int resi){
        this.resi = resi;
    }
    public int getResi(){
        return resi;
    }
    public void setHarga(int harga){
        this.harga = harga;
    }
    public int getHarga(){
        return harga;
    }
    
}
