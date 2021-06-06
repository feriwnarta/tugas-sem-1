/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas10;

/**
 *
 * @author Feri Winarta
 */
import java.io.*;
public class tes {
    public static void main(String[] args) {
        try{
            File newFile = new File("inputt.txt");
            if(newFile.createNewFile()) {
                System.out.println("Berhasil dibuat");
            } else {
                System.out.println("gagal");
            }
        } catch(Exception e) {
            System.out.println(e);
        }
        
        try{
        writen();
        } catch(Exception e) {
            System.out.println(e);
        }
        
    }
    
    private static void writen()throws Exception {
        FileWriter tulis = new FileWriter("inputt.txt");
        tulis.write("Hallo semua \n");
        tulis.close();
    
    
    }
}
