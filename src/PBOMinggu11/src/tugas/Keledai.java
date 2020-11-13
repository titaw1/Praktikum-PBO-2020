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
public class Keledai extends Binatang implements IHerbivora{
    private String jenis;
    private String suara;
    private String warnaBulu;
    
    public Keledai(String jenis, String nama, int jmlKaki, String suara, String warnaBulu){
        super(nama, jmlKaki);
        this.jenis = jenis;
        this.suara=suara;
        this.warnaBulu=warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Tumbuhan");
    }
    
    public void displayBinatang(IHerbivora herbivora){
        System.out.println("Jenis: "+this.jenis);
        System.out.print("Makanan: ");
        herbivora.displayMakan();
    }
    public void displayData(){
        System.out.println("Suara: "+this.suara);
        System.out.println("Warna Bulu: "+this.warnaBulu);
    }
}
