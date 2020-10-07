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
public class PersegiPanjang extends BangunDatar{
    public float panjang;
    public float lebar;
    
    public PersegiPanjang(){
        super();
    }    
    @Override
    public float luas(){
        float luas = panjang*lebar;
        System.out.println("Luas persegi panjang : "+luas);
        return luas;
    }
    @Override
    public float keliling(){
        float keliling = 2*(panjang+lebar);
        System.out.println("Keliling persegi panjang : "+keliling);
        return keliling;
    }
}
