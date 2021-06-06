/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasir;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Cetak {
    // database sementara
    float Super = 19.000f;
    float pilter = 19.000f;
    float mild = 24.000f;
            
            
    void dataCetak() throws IOException{
        FileWriter write = new FileWriter("cetak.txt");
        BufferedWriter buff = new BufferedWriter(write);
        
        System.out.println("\t\tTOKO JAYA");
        System.out.println("\n\n");
        System.out.println("NO    : ");
        System.out.println("Pel   : CASH 2");
        System.out.println("Sales : ");
        System.out.println("----------------------------------------------");
        loopCetak();
    }
     
    void loopCetak() {
        String[]data = getBarang();
        System.out.println(Arrays.toString(data));
//        for(int i = 0; i < barang.length; i++) {
//            if(barang[i].equalsIgnoreCase("super")) {
//                System.out.println("Super");
//                //System.out.println(quantity[i] + "x" + Super);
//            } else if (barang[i].equalsIgnoreCase("pilter")){
//                System.out.println("pilter");
//                //System.out.println(quantity[i] + "x" + pilter);
//            } else if (barang[i].equalsIgnoreCase("mild")) {
//                System.out.println("mild");
//                //System.out.println(quantity[i] + "x" + mild);
//            }
//        }
     }
    
    
    void hitungHarga() {
       
    }
    
}
