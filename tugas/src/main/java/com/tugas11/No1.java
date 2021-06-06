/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas11;

/**
 *
 * @author Feri Winarta
 */
import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
public class No1 {
    
    public static void main(String[] args)throws Exception {
        Scanner input = new Scanner(System.in);
        int banyak;
        
        System.out.println("Banyak Karakter 1 - 8");
        banyak = input.nextInt();
        while(banyak > 8) {
            System.err.println("Jumlah inputan banyak karakter lebih dari 8");
            banyak = input.nextInt();
            if(banyak <= 8) {
                break;
            }
        }
        char[] data = new char[banyak];
        for(int i = 0; i < banyak; i++) {
            System.out.println("Karakter ke " + (i + 1));
            data[i] = input.next().charAt(0);
        }
        System.out.println("\nData sebelum sorting");
        System.out.println("====================");
        System.out.println(Arrays.toString(data));
        System.out.println("====================");
        
          //Proses Sorting Bubble Sort
        char temp = 0;
        for(int i = 1; i < data.length; i++){
            for(int j = data.length - 1; j >= i; j--){
                //Proses Bandingkan
                if(data[j] < data[j-1]){
                    temp = data[j];
                    data[j] = data[j-1];
                    data[j-1] = temp;
                }
            }
        }
        System.out.println("\nData sesudah Sorting");
        System.out.println("===============");
        System.out.println(Arrays.toString(data));
        System.out.println("==================");
    }
    
    
}
