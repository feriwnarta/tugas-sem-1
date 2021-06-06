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
public class No1 {
    public static void main(String[] args) {
  System.out.println("Bilangan Genap antara 1-20 = ");
  System.out.println("-----");
        int a = 1, b = 2,jumlah = 0;

            while(a <= 10){
                jumlah += b;
                System.out.print(b + " + ");
                
                b = b + 2;
                a++;
            }
            
            System.out.println(" = "+jumlah);
    }
}
