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
public class No41 {
    public static void main(String[] args) {
        int j = 11;
        int a = 1;
        for (int i = 1; i <= 6; i++) {
            if(i == 6) {
                j =+ 1;
            }
            for (; j <= 11; j++) {
                System.out.print("0");
            }           
               for(; a <= 10; a++) {
                   if(i == 6) {
                       break;
                   }
                   System.out.print("*");
               }
            a =+ 1;
            j =+ 11;
            
                
            
            System.out.println("");
            
        }   
    }
}
