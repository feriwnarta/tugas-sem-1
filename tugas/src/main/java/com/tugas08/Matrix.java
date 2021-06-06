/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas08;

/**
 *
 * @author Feri Winarta
 */
import java.util.*;
public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
//                          baris   klom
        int baris1 = 0;
        int kolom1 = 0;
        int baris2 = 0;
        int kolom2 = 0;
        
        System.out.println("Masukan jumlah baris matriks ke 1 = ");
        baris1= input.nextInt();
        System.out.println("Masukan jumlah kolom matriks ke 1 = ");
        kolom1 = input.nextInt();
        
        System.out.println("Masukan jumlah baris matriks ke 2 = ");
        baris2= input.nextInt();
        if(baris2 < kolom1 || baris2 > kolom1 ) {
            System.out.println("Kode salah silahkan masukan baris matriks ke 2"
                    + " sesuai dengan kolom matriks ke 1");
            baris2 = input.nextInt();
        }
         System.out.println("Masukan jumlah kolom matriks ke 2 = ");
         kolom2 = input.nextInt();

        int[][]matriks1 = new int[baris1][kolom1];
        int[][]matriks2 = new int[baris2][kolom2];
        
        for(int i = 0; i < baris1; i++) {
            for(int a = 0; a < kolom1; a++) {
                System.out.println("Masukan matriks 1 baris ke " + (i + 1) + " dan kolom ke " + (a + 1));
                matriks1[i][a] = input.nextInt();
            }   
        }
        for(int b = 0; b < baris2; b++) {
            for(int c = 0; c < kolom2; c++) {
               System.out.println("Masukan matriks 2 baris ke " + (b + 1) + " dan kolom ke " + (c + 1));
               matriks2[b][c] = input.nextInt();
             }
        }
        
//        tampil matriks
          System.out.println("Matriks ke 1");

          for(int i = 0; i < baris1; i++) {
            for(int a = 0; a < kolom1; a++) {
                System.out.print("[");
                System.out.print(" " + matriks1[i][a] + " ");
                System.out.print("]");
            }   
              System.out.println("");
          }

         System.out.println("");
         System.out.println("Matriks ke 2");

            for(int b = 0; b < baris2; b++) {
                for(int c = 0; c < kolom2; c++) {
                    System.out.print("[");
                    System.out.print(" " + matriks2[b][c] + " ");
                    System.out.print("]");
                 }
                System.out.println("");
            }
            
            int matrixTotal1 = 0;
            int matrixTotal2 = 0;
            
           int c = 0;
           int d = 0;
            for(int i = 0; i < baris1; i++) {
                for(int b = 0; b < kolom2; b++) {
                    matrixTotal1 = matriks1[c][i] * matriks2[d][b];
                }
                c += 1;
                
            }
            
            for(int i = 0; i < baris2; i++) {
                for(int z = 0 ; z < kolom1; z++) {
                    matrixTotal2 = matriks1[i][2] * matriks2[z][2];
                }
            }
            
            System.out.println(matrixTotal1 + matrixTotal2);
            
           
    
    }

        
       
//        System.out.println(Arrays.toString(matriks1));
//        System.out.println(Arrays.toString(matriks2));
        
        
      
        
        
    }

