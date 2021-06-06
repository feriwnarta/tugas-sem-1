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
public class No5 {
    public static void main(String[] args) {
        int total =30;
        int genap = 2;
        
        int a;
        
        int b = 10;
        int g = 0;
        int f = 2;
        
        for(a=5; a>=1; a--){
            for(int j = b; j > g; j -= genap){
                System.out.print(j);
                if (j == f) {
                    break;
                    
                } else {
//                    if (j == a) {
//                        break;
//                    }
                   System.out.print("+"); 
                 
                }   
            }
            g = g + 2;
            f = f + 2;
            
            System.out.print("=");
            System.out.println(total);
            total = total - f + 2;
           
        }
    }
}
