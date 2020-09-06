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
public class rok {
    private String bahan;
    private String model;
    private int panjang;
    private int lingkarPinggang;
    
    public void setbahan(String newValue){
        bahan = newValue;
    }
    
    public void setModel(String newValue){
        model = newValue;
    }
    
    public void setpanjang(int pjg){
        panjang = pjg;
    }
    
    public void setlingkar(int lp){
        lingkarPinggang = lp;  
    }
    
    public void cetakStatus(){
        System.out.println("Bahan : "+bahan);
        System.out.println("Model : "+model);
        System.out.println("Panjang : "+panjang+" cm");
        System.out.println("Lingkar Pinggang : "+lingkarPinggang+" cm");
    }
}
