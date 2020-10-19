/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @author tita
 */
public class Mesin {
    public String merek;
    private double kecepatan;
    
    
    public Mesin(){
        
    }
    public Mesin(String merek, double kecepatan){
        this.merek=merek;
        this.kecepatan=kecepatan;
    }
    public void setMerek(String merek){
        this.merek=merek;
    }
    public String getMerek(){
        return merek;
    }
    public double getKecepatan(){
        return kecepatan;
    }
    public void tambahKecepatan(){
        if(getMerek().equalsIgnoreCase("Honda")){
            System.out.println(""+ (kecepatan+=10)+" km/jam");
        }else{
            System.out.println(""+ (kecepatan+=15)+" km/jam");
        }
    }
    public void kurangiKecepatan(){
        if(getMerek().equalsIgnoreCase("Honda")){
            System.out.println(""+ (kecepatan-=5)+" km/jam");
        }else{
            System.out.println(""+ (kecepatan-=10)+" km/jam");
        }
    }
}