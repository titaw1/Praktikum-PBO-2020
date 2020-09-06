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
public class SepatuRoda extends sepatu{
    private int jumlahRoda;
    
    public int jumlahRoda(int jumRoda){
        jumlahRoda = jumRoda;
        return jumlahRoda;
    }
    
    public void cetakStatus(){
        super.cetakStatus();
        System.out.println("Jumlah Roda : "+jumlahRoda);
    }
}
