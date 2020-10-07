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
public class Lingkaran extends BangunDatar{
    public float r;
     
    @Override
    public float luas(){
        float luas = (((float)Math.PI)*r*r);
        System.out.println("Luas lingkaran : "+luas);
        return luas;
    }
    
    @Override
    public float keliling(){
        float keliling = (2*((float)Math.PI)*r);
        System.out.println("Keliling lingkaran : "+keliling);
        return keliling;
    }
}
