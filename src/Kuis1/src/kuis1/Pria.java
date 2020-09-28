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
public class Pria{
    private Wanita istri;
    private Manusia manusia;

    
    public Pria(){
        
    }
    public Pria(int umur, String nama, boolean dewasa, Wanita istri){
        
    }
    public void setManusia(Manusia manusia){
        this.manusia = manusia;
    }
    public Manusia getManusia(){
        return manusia;
    }
    public void setIstri(Wanita istri){
        this.istri = istri;
    }
    public Wanita getIstri(){
        return istri;
    }
    public String info(){
        
        String info = "";
        info += (this.manusia.info()+"\n");
        if(manusia.getUmur() < 22){
            System.out.println("Pria ini masih kuliah");
        } else{
            info += ("Istri : " + istri.getManusia().getNama()+"\n");
        }
        return info;
    }
    
}
