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
public class Demo {
    public static void main(String[] args) {
        Keledai kedelai = new Keledai( "Herbivora", "Kedelai", 4,"Hehehehe", "Abu-abu");
        kedelai.displayBinatang(kedelai);
        kedelai.displayBinatang();
        kedelai.displayData();
        System.out.println();
        
        Gorilla gulali = new Gorilla("Karnivora + Herbivora", "Gulali", 4, "Haaum Hauum", "Hitam Manis");
        gulali.displayBinatang(gulali);
        gulali.displayBinatang();
        gulali.displayData();
        System.out.println();
        
        Singa cingacing = new Singa("Karnivora", "CingaCing", 4, "Roaar Roaaar", "Coklat");
        cingacing.displayBinatang(cingacing);
        cingacing.displayBinatang();
        cingacing.displayData();
        
        
    }
}
