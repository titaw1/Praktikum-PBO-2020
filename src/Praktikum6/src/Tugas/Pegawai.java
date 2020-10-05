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
public class Pegawai {
    public String nip;
    public String nama;
    public String alamat;
    public DaftarGaji daftarGaji;
    
    public Pegawai(String nip, String nama, String alamat){
        
    }
    public String getNama(){
        return nama;
    }
    public int getGaji(){
        return daftarGaji.gaji;
    }
}
