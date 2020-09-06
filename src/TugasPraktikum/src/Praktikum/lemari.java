/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author tita
 */
public class lemari {
    private String bahan, warna;
    private int panjang, lebar, tinggi;
    private double volume;
    
    public void setBahan(String newValue){
        bahan = newValue;
    }
    public void setWarna(String newValue){
        warna = newValue;
    }
    public double hitungVolume(int p, int l, int t){
        panjang = p;
        lebar = l;
        tinggi = t;
        volume = panjang*lebar*tinggi;
        return volume;
    }
    public void cetakStatus(){
        System.out.println("Bahan : "+bahan);
        System.out.println("Warna : "+warna);
        System.out.println("Volume : "+volume+"cm^3");
    }
}
