/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas4;
/**
 *
 * @author tita
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JasaKirim jk = new JasaKirim();
        jk.setNama("J&T EXPRESS");
        jk.setResi(123456789);
        jk.setHarga(28000);
        
        Toko t = new Toko();
        t.setNama("Radiant Official Store");
        t.setAlamat("Jl. Tanah Abang No. 15");
        t.setJasaKirim(jk);
        System.out.println(t.cetakData());
        
        Barang b = new Barang();
        b.setNama("Bio Oil");
        b.setHarga(65000);
        Pembeli pb = new Pembeli();
        pb.setNama("Tita Wijayanti");
        pb.setAlamat("Jl. Kucur Sumberrejo RT.02/RW.01");
        pb.setBarang(b);
        System.out.println(pb.cetakData());
        System.out.println("Harga Total \t\t : "+(jk.getHarga()+b.totalHarga(2)));
    }
    
}
