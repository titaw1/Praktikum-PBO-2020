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
public class Leptop extends Komputer{
    public String jnsBatrei;
    
    public Leptop(){
        
    }
    public Leptop(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei){
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBatrei=jnsBatrei;
    }
    public void tampilLeptop(){
        super.tampilData();
        System.out.println("Jenis Batrei\t\t="+jnsBatrei);
    }
}
