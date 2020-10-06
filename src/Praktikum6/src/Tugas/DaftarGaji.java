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
public class DaftarGaji {
    public Pegawai[] listPegawai;
    public int jumlahPegawaiSekarang=0;
    
    public DaftarGaji(int jumlahPegawai){
        listPegawai = new Pegawai[jumlahPegawai];
    }
    public void addPegawai(Pegawai pegawai){
        listPegawai[jumlahPegawaiSekarang] = pegawai;
        jumlahPegawaiSekarang++;
    }
    public void printSemuaGaji(){
        for(int i=0;i<jumlahPegawaiSekarang;i++){
            System.out.println(listPegawai[i].getNama()+" mendapatkan gaji "+listPegawai[i].getGaji());
        }
    }
}
