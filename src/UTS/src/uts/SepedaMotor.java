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
public class SepedaMotor extends Mesin{
    private Mesin mesin;
    private String merekMotor;

    
    public SepedaMotor(){
        
    }
    public SepedaMotor(String merekMotor, String merekMesin){
        this.merekMotor=merekMotor;
        super.merek=merekMesin;
    }
    public void setMerekMotor(String merekMotor){
        this.mesin.setMerek(merekMotor);
    }
    public String getMerekMotor(){
        return merekMotor;
    }
    public String getMerekMesin(){
        return super.merek;
    }
    public void tambahKecepatanMotor(){
        super.tambahKecepatan();
    }
    public void kurangiKecepatanMotor(){
        super.kurangiKecepatan();
    }
}
