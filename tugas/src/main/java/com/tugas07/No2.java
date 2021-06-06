/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas07;

/**
 *
 * @author Feri Winarta
 */
import java.util.*;
public class No2 {
    public static void main(String[] args) {
//        membuat Scanner
        Scanner input = new Scanner(System.in);
//        input byk
        int inputByk;
        
        System.out.println("Banyak jenis = ");
        inputByk = input.nextInt();
        int[] dataByk = new int[inputByk];
        String[] inputDps = new String[inputByk];
        int[] bykPotong = new int[inputByk];
        
        for(int i = 0; i < inputByk; i++) {
            System.out.println("Jenis ke = " + (i + 1));
            dataByk[i] = (i + 1);
            System.out.println("Jenis potong [D/P/S] = ");
            inputDps[i] = input.next();
            System.out.println("Banyak Potong = ");
            bykPotong[i] = input.nextInt();
        }
//        set array
        double[] harga = setHarga(inputDps);
        double[] jmlHrg = jumlahHrg(inputDps,bykPotong);
        String[] setNama = setNama(inputDps);
        
//        output
        System.out.println("");
        output(dataByk,setNama,harga,bykPotong,jmlHrg);
        
//          double total = 0;
//        
//        for(int i = 0; i < jmlHrg.length; i++) {
//            for(int c = i; c <= i; c++) {
//                total += jmlHrg[c];
//            }
//        }
        
        
        double jmlByr = jumlahBayar(jmlHrg);
        System.out.println(jmlByr);
    
        
    }
    
    public static double[] setHarga(String[] dps) {
        
        double[] setHrg = new double[dps.length]; 
        for(int i = 0; i < dps.length; i++) {
            if(dps[i].equalsIgnoreCase("d")) {
                setHrg[i] = 25000d;
            } else if(dps[i].equalsIgnoreCase("p")) {
                setHrg[i] = 20000d;
            } else {
                setHrg[i] = 15000d;
            }       
       }
        return setHrg;
    }
    
    public static String[]setNama(String[] dps) {
        String[] setNama = new String[dps.length];
        
            for(int i = 0; i < dps.length; i++) {
                if(dps[i].equalsIgnoreCase("d")) {
                    setNama[i] = "Dada";
                } else if (dps[i].equalsIgnoreCase("p")) {
                    setNama[i] = "Paha";
                } else {
                    setNama[i] = "Sayap";
                }
           }
        return setNama;
    }
    
    public static double[] jumlahHrg(String[]dps, int[] bykPotong) {
        double totalHarga[] = new double[bykPotong.length];
        
        for(int i = 0; i < dps.length; i++) {
            if(dps[i].equalsIgnoreCase("d")) {
                totalHarga[i] = 25000d * bykPotong[i];
            } else if(dps[i].equalsIgnoreCase("p")) {
                totalHarga[i] = 20000d * bykPotong[i]; 
            } else {
                totalHarga[i] = 15000d * bykPotong[i];
            }
        }
        return totalHarga;
    }
    
    public static void output(int[]dataByk,String[]setNama,
             double[] harga,int[]bykPotong,double[] jmlHarga) {
//        System.out.println("\t\tGerobak Fried Chicken");
//        System.out.println("================================================================="
//                + "=======================================");
//        System.out.println("No.\t\tJenis potong\t\tharga satuan\t\tbanyak beli\t\t"
//                + " jumlah harga");
        
        for(int i = 0; i < dataByk.length; i++) {
            System.out.println("No " + dataByk[i]);
            System.out.println("Jenis Potong " + setNama[i]);
            System.out.println("Harga Satuan " + harga[i]);
            System.out.println("Banyak Beli " + bykPotong[i]);
            System.out.println("Jumlah Harga " + jmlHarga[i]);
            
            
        }
    }
    
    public static double jumlahBayar(double[] jmlHrg) {
        double total = 0;
        
        for(int i = 0; i < jmlHrg.length; i++) {
            for(int c = i; c <= i; c++) {
                total += jmlHrg[c];
            }
        }
        
        return total;
    }


}


