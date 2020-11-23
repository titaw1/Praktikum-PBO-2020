/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2;

/**
 *
 * @author tita
 */
public class Majalah extends MediaInformasi{
    public void setJMLHalaman(int jml){
        super.jmlHalaman=jml;
    }
    public void reputasi(){
        System.out.println("Majalah ini memiliki: "+super.jmlHalaman);
        System.out.println("Jika dihitung dengan covernya, maka jumlah halaman dari majalah tersebut: "+(super.jmlHalaman+2)+" halaman");
        System.out.println("Penerbit majalah ini bereputasi!\n");
    }
}
