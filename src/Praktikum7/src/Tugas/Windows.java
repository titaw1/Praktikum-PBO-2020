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
public class Windows extends Leptop{
    public String fitur;
    
    public Windows(){
        
    }
    public Windows(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBatrei, String fitur){
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jnsBatrei);
        this.fitur=fitur;
    }
    public void tampilWindows(){
        super.tampilLeptop();
        System.out.println("Fitur\t\t\t="+fitur);
        System.out.println("=======================================================");
        System.out.println();
    }
}
