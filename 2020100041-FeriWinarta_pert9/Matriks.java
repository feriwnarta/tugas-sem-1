package com.tugas08;
import java.util.Scanner;
public class Matriks {
    public static void main(String[] args) {
        int matrix1 [][] = new int[2][2];
            matrix1 [0][0] = 1;
            matrix1 [0][1] = 2;
            matrix1 [1][0] = 4;
            matrix1 [1][1] = 5;
            
        int matrix2 [][] = new int[2][2];
            matrix2 [0][0] = 6;
            matrix2 [0][1] = 5;
            matrix2 [1][0] = 3;
            matrix2 [1][1] = 2;
            
        int hasil [][] = new int [2][2];
        
        System.out.println("matrik1");
        System.out.print(matrix1[0][0] + "\t");
        System.out.println( matrix1 [0][1]);
        System.out.print(matrix1 [1][0] + "\t");
        System.out.println(matrix1 [1][1]);
        
        System.out.println("matrik2");
        System.out.print(matrix2[0][0] + "\t");
        System.out.println( matrix2 [0][1]);
        System.out.print(matrix2 [1][0] + "\t");
        System.out.println(matrix2 [1][1]);
        
        hasil[0][0]=matrix1[0][0]*matrix2[0][0]+matrix1[0][1]*matrix2[1][0];
        hasil[0][1]=matrix1[0][0]*matrix2[0][1]+matrix1[0][1]*matrix2[1][1];
        hasil[1][0]=matrix1[1][0]*matrix2[0][0]+matrix1[1][1]*matrix2[1][0];
        hasil[1][1]=matrix1[1][0]*matrix2[0][1]+matrix1[1][1]*matrix2[1][1];
         
        System.out.println("Hasil perkalian Matriks A dan B");
        for(int x=0;x<2;x++){
            for(int y=0;y<2;y++){
                System.out.print(hasil[x][y]+ "\t");
            }
            System.out.println(" ");
        }
    }
}
