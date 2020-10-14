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
public class Kerucut extends VolumeBangunRuang{
    
    public Kerucut(){
        
    }
    public Kerucut(String jenis, int sisi, int panjang, int lebar, int tinggi, float jari2){
        super(jenis, sisi, panjang, lebar, tinggi, jari2);
    }
    @Override
    public float hitungVolume(){
        super.info();
        System.out.println("Jenis Bangun Ruang\t : "+jenis);
        float volume = (((float)Math.PI)*jari2*jari2*tinggi)/3;
        System.out.println("Volume Bangun Ruang\t : "+volume+" cm^3"); 
        System.out.println("=================================================");
        System.out.println();
        return volume;
    }
}
