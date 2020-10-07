/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author tita
 */
public class Segitiga extends BangunDatar{
    public float alas;
    public float tinggi;
    
    @Override
    public float luas(){
        float luas = (alas*tinggi)/2;
        System.out.println("Luas segitiga : "+luas);
        return luas;
    }
    
    @Override
    public float keliling(){
        //karena disini tidak ada sisi maka saya anggap alas sebagai sisinya atau disini diibaratkan segitiga sama sisi
        float keliling = alas + alas + alas;
        System.out.println("Keliling segitiga : "+keliling);
        return keliling;
    }
}
