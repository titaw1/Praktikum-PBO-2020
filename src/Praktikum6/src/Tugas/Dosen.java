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
public class Dosen extends Pegawai{
    public int jumlahSKS;
    public int TARIF_SKS;
    
    public Dosen(){
    
    }
    public Dosen(String nip, String nama, String alamat){
        super(nip, nama, alamat);
    }
    public void setJumlahSKS(int jumlahSKS){
        this.jumlahSKS = jumlahSKS;
    }
    public int getJumlahSKS(){
        return jumlahSKS;
    }
    public void setTARIF_SKS(int TARIF_SKS){
        this.TARIF_SKS=TARIF_SKS;
    }
    public int getTARIF_SKS(){
        return TARIF_SKS;
    }
    public int getGaji(){
        return (this.jumlahSKS*this.TARIF_SKS)+super.getGaji();
    }
}
