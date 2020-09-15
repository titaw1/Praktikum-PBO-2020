/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

import java.util.Scanner;

/**
 *
 * @author tita
 */
public class TestKoperasi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota: "+ donny.getNama());
        System.out.println("Limit Pinjaman: "+ donny.getLimitPinjaman());
        
        System.out.print("\nMeminjam uang : ");
        int pjm = sc.nextInt();
        donny.pinjam(pjm);
        System.out.println("Jumlah pinjaman saat ini: "+donny.getJumlahPinjaman());
        
        System.out.print("\nMeminjam uang : ");
        pjm = sc.nextInt();
        donny.pinjam(pjm);
        System.out.println("Jumlah pinjaman saat ini: "+donny.getJumlahPinjaman());

        System.out.print("\nMembayar uang : ");
        int ang = sc.nextInt();
        donny.angsur(ang);
        System.out.println("Jumlah pinjaman saat ini: "+donny.getJumlahPinjaman());
        
        System.out.print("\nMembayar uang : ");
        ang = sc.nextInt();
        donny.angsur(ang);
        System.out.println("Jumlah pinjaman saat ini: "+donny.getJumlahPinjaman());
    }
}
