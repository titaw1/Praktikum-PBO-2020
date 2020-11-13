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
public class Gorilla extends Binatang implements IKarnivora, IHerbivora{
    private String jenis;
    private String suara;
    private String warnaBulu;
    
    public Gorilla(String jenis, String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.jenis = jenis;
        this.suara = suara;
        this.warnaBulu = warnaBulu;
    }
    
    public void displayMakan(){
        System.out.println("Daging + Tumbuhan");
    }
    public void displayBinatang(IKarnivora krn){
        System.out.println("Jenis: "+this.jenis);
        System.out.print("Makanan: ");
        krn.displayMakan();
    }
    public void displayData(){
        System.out.println("Suara: "+this.suara);
        System.out.println("Warna Bulu: "+this.warnaBulu);
    }
}
