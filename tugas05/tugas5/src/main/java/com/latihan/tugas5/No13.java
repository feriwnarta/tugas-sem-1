/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.latihan.tugas5;

/**
 *
 * @author Louiss Figo
 */
public class No13 {
    public static void main(String[] args) {
        
           for(int a = 1; a <= 9; a++) {
               if(a == 1) {
                System.out.print(a);
                System.out.print(a);
               } 
               a += 1;
               System.out.print(a);
               a =+ 3;
                for(; a <= 4; a++) {
                    if(a == 3){
                    for(int b = 1; b <= 3; b++) {
                        System.out.print(a);
                        }
                    }
                    if(a == 4) {
                        for(int c = 1; c <= 4; c++) {
                            System.out.print(a);
                        }
                    }
                }
                a =+ 7;
                for(int d = 1; d <= a; d++) {
                    System.out.print(d);
                    if(d == 7) {
                        for(int e = 1; e <= a; e++) {
                            System.out.print(d);
                        }
                    }
                }
                a += 1;
                for(int f = 1; f <= a; f++) {
                    System.out.print(a);
                }
                a =+ 9;
                for(int g = 1; g <= a; g++) {
                    System.out.print(g);
                   
                }
                
                
               
           }
           
            

    }
}
