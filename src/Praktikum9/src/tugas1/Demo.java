/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas1;

/**
 *
 * @author tita
 */
public class Demo {
    public static void main(String[] args) {
        Segitiga s1 = new Segitiga();
        System.out.println(">>>Menggunakan method total sudut<<<");
        System.out.println("Total sudut : "+s1.totalSudut(90));
        System.out.println(">>>Menggunakan method total sudut overloading<<<");
        System.out.println("Total sudut : "+s1.totalSudut(45, 30));
        
        Segitiga s2 = new Segitiga();
        System.out.println(">>>Menggunakan method keliling<<<");
        System.out.println("Keliling : "+s2.keliling(15, 20, 25));
        System.out.println(">>>Menggunakan method keliling overloading<<<");
        System.out.println("Sisi C : "+s2.keliling(15, 20));
    }
}
