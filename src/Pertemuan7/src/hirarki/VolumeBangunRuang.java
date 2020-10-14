/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hirarki;

/**
 *
 * @author tita
 */
public class VolumeBangunRuang {
    public String jenis;
    public float sisi;
    public float panjang;
    public float lebar;
    public float tinggi;
    public float jari2;
    
    public VolumeBangunRuang(){
        
    }
    public VolumeBangunRuang(String jenis, int sisi, int panjang, int lebar, int tinggi, float jari2){
        this.jenis=jenis;
        this.sisi=sisi;
        this.panjang=panjang;
        this.lebar=lebar;
        this.tinggi=tinggi;
        this.jari2=jari2;
    }
    public float hitungVolume(){
        return 0;
    }
    public void info(){
        System.out.println("===============Volume Bangun Ruang===============");
    }
}
