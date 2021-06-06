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
public class No11 {
    public static void main(String[] args) {
        int x,y,z,max;
         max = 6;
       for ( x = max ; x>=1; x-- ) {
            if(x % 2 == 1) {
                for(z = x; z >= 1; z--)
                    System.out.print(z);
        }
            if(x % 2 == 0) {
                for (y = x; y >= 1; y--){
                    System.out.print(x);     
            }
        }

        
}
}
}
