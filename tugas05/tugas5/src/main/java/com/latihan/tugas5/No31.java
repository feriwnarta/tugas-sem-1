/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.latihan.tugas5;

/**
 *
 * @author Feri Winarta
 */
import java.util.Scanner;
public class No31 {
    public static void main(String[] args) {
     int awal;
     int akhir;
     Scanner input = new Scanner(System.in);
        System.out.println("Masukan nilai awal 1 - 100 = ");
        awal = input.nextInt();
        System.out.println("Masukan nilai Akhir 50 - seterusnya = ");
        akhir = input.nextInt();
            for(; awal <= akhir; awal++) {
                if(awal % 5 == 0) {
                    System.out.println("Bilangan yang habis dibagi 5 " + awal);
                }
            } 
        
        
        
    }
}
