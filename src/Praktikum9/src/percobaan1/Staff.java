/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan1;

/**
 *
 * @author tita
 */
public class Staff extends Karyawan{
    private int lembur;
    private double gajiLembur;
    
    public void setLembur(int lembur){
        this.lembur=lembur;
    }
    public int getLembur(){
        return lembur;
    }
    public void setGajiLembur(double gajiLembur){
        this.gajiLembur=gajiLembur;
    }
    public double getGajiLembur(){
        return gajiLembur;
    }
    public double getGaji(int lembur, double gajiLembur){
        return super.getGaji()+lembur*gajiLembur;
    }
    public double getGaji(){
        return super.getGaji()+lembur*gajiLembur;
    }
    public void lihatInfo(){
        System.out.println("NIP\t\t :"+this.getNip());
        System.out.println("Nama\t\t :"+this.getNama());
        System.out.println("Golongan\t :"+this.getGolongan());
        System.out.println("Jml Lmebur\t :"+this.getLembur());
        System.out.printf("gaji Lembur\t :%.0f\n", this.getGajiLembur());
        System.out.printf("Gaji\t\t :%.0f\n",this.getGaji());
    }
}
