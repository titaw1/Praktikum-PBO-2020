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
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pc p = new Pc("HP", 3, 8, "AMD", 12);
        p.tampilPc();
        
        Mac m = new Mac("Lenovo", 1, 4, "Intel Core i3", "Ni-MH", "Advisories");
        m.tampilMac();
        
        Windows w = new Windows("Asus Vivobook", 2, 4, "Intel Pentium Gold", "lithium-prismatic", "Grafis Intel HD Graphics 610");
        w.tampilWindows();
    }
    
}
