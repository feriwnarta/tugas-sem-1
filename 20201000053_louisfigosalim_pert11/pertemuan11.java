/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas11;

/**
 *
 * @author Louiss Figo
 */
import java.util.Scanner;
import java.util.Arrays;
public class pertemuan11 {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        
        int karakter;
        System.out.println("Masukan jumlah Karakter Maksimal 8");
        karakter = inputUser.nextInt();
        while(karakter > 8) {
            System.err.println("Jumlah inputan banyak karakter lebih dari 8");
            karakter = inputUser.nextInt();
            if(karakter <= 8) {
                break;
            }
        }
        
        char[] banyak = new char[karakter];         
        for(int i = 0; i < karakter; i++) {
            if(i == 0) {
            System.out.println("Masukan Karakter");
            banyak[i] = inputUser.next().charAt(0);
            } else {
            banyak[i] = inputUser.next().charAt(0); 
            }
        }
        System.out.println("\nKarakter sebelum sorting");
        System.out.println(Arrays.toString(banyak));
        char temp = 0;
        int f = banyak.length;
        for(int i = 1; i < f; i++){
            for(int j = f - 1; j >= i; j--){
                //Proses Bandingkan
                if(banyak[j] < banyak[j-1]){
                    temp = banyak[j];
                    banyak[j] = banyak[j-1];
                    banyak[j-1] = temp;
                }
            }
        }
        System.out.println("\nKarakter Sesudah sorting");
        System.out.println(Arrays.toString(banyak));
        
    }
}
