/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author tita
 */
public abstract class Binatang {
    protected String nama;
    protected int jmlKaki;
    
    public Binatang(String nama, int jmlKaki){
        this.nama = nama;
        this.jmlKaki = jmlKaki;
    }
    public void displayBinatang(){
        System.out.println("Nama: "+this.nama);
        System.out.println("Jumlah Kaki: "+this.jmlKaki);
    }
}
