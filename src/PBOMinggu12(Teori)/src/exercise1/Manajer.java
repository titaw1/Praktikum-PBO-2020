/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise1;

/**
 *
 * @author tita
 */
public class Manajer extends Pegawai{
    private int tunjangan;

    public Manajer(String nama , int gaji , int tunjangan){
        super(nama, gaji);
        this.tunjangan=tunjangan;
    }
    @Override
    public int getGaji() {
        return super.getGaji();
    }
    public int getTunjangan() {
        return tunjangan;
    }
}
