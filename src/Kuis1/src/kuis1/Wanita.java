/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis1;

/**
 *
 * @author tita
 */
public class Wanita{
    private Pria suami;
    private Manusia anak;
    private Manusia manusia;
    
    public Wanita(){
        
    }
    public Wanita(int umur, String nama, boolean dewasa, Pria suami){
        
    }
    public void setManusia(Manusia manusia){
        this.manusia = manusia;
    }
    public Manusia getManusia(){
        return manusia;
    }
    public void setSuami(Pria suami){
        this.suami = suami;
    }
    public Pria getSuami(){
        return suami;
    }
    public void setAnak(Manusia anak){
        this.anak = anak;
    }
    public Manusia getAnak(){
        return anak;
    }
    public String info(){
        String info = "";
        info += (this.manusia.info()+"\n");
        if(manusia.getUmur() < 22){
            System.out.println("Wanita ini masih kuliah");
        } else{
            info += ("Suami : "+suami.getManusia().getNama()+"\n");
            info += ("Anak : "+anak.getNama()+"\n");
        }
        return info;
    }
}
