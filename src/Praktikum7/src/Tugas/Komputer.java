/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author tita
 */
public class Komputer {
    public String merk;
    public int kecProsesor;
    public int sizeMemory;
    public String jnsProsesor;
    
    public Komputer(){
        
    }
    public Komputer(String merk, int kecProsesor, int sizeMemory, String jnsProsesor){
        this.merk=merk;
        this.kecProsesor=kecProsesor;
        this.sizeMemory=sizeMemory;
        this.jnsProsesor=jnsProsesor;
    }
    public void tampilData(){
        System.out.println("=======================================================");
        System.out.println("Merk\t\t\t="+merk);
        System.out.println("Kecepatan Prosesor\t="+kecProsesor+" GHz");
        System.out.println("Size Memory\t\t="+sizeMemory+" GB");
        System.out.println("Jenis Prosesor\t\t="+jnsProsesor);
    }
}
