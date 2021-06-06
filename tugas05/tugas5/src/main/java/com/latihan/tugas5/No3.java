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
public class No3 {
    public static void main(String[] args) {
        int total=0;
 for(int k=1; k<=5; k++){
   for(int l=1;l<=k;l++){
        total = total + 1 ;
  
          
          System.out.print(l);
          if(l == k) break; 
          System.out.print("+");
	
    }
    	System.out.print("=");
        System.out.println(total);
 }
    }
}
