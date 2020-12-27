/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarunittesting;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author tita
 */
public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(PengolahPesanTest.class);
        
        for(Failure f : result.getFailures()){
            System.out.println(f.toString());
        }
        
        boolean berhasil = result.wasSuccessful();
        
        System.out.println("Tes berhasil? "+berhasil);
    }
}
