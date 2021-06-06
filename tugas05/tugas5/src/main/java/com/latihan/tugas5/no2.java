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
public class no2 {
    public static void main(String[] args) {
        int a,b;
        System.out.println("A");
        for (a=1; a<=5; a++){
            for(b=a; b<=5; b++){
                System.out.print("*");
            }
            System.out.println("");
            
        }
        System.out.println("B");
        for (int c=1; c<=5; c++){
            for(int d=1; d<=c; d++){
                System.out.print("*");
            }
            System.out.println("");
        }
        
        System.out.println("C");

       int x = 11;
       for (int i = 1; i <= 6; i++){
           for (; x >= 1; x--){
               System.out.print("0");
           }
           for(int d = i; d > 0; d--){
               System.out.print("*");
           }
           System.out.println();
           x =+ 1;
           
           
    }
        System.out.println("D");
        
     int y = 1;
       for (int i = 6; i > 1; i--) {
           for (int v = i; v < 6; v++) {
               System.out.print("");
           }
           for (int z = 6 - y; z > 0; z--) {
               System.out.print("*");
           }
           System.out.println();
           y += 1;
    }
    }
}
