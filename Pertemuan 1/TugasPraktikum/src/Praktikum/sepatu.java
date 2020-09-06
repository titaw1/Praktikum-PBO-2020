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
public class sepatu {
    private String merek, warna;
    private int ukuran;
    
    public void setMerk(String newValue){
        merek = newValue;
    }
    
    public void setWarna(String newValue){
        warna = newValue;
    }
    
    public int ukuran(int uk){
        ukuran = uk;
        return ukuran;
    }
    
    public void cetakStatus(){
        System.out.println("Merek : "+merek);
        System.out.println("Warna : "+warna);
        System.out.println("Ukuran : "+ukuran+" cm");
    }   
}
