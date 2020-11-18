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
public class Programmer extends Pegawai{
    private int bonus;

    public Programmer(String nama , int gaji , int bonus){
        super(nama, gaji);
        this.bonus=bonus;
    }
    @Override
    public int getGaji() {
        return super.getGaji();
    }
    public int getBonus() {
        return bonus;
    }
}
