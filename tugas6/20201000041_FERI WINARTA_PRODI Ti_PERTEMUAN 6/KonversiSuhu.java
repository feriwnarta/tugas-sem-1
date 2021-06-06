/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.latihan.Tugas6;
import java.util.Scanner;
/**
 *
 * @author Feri Winarta
 */
public class KonversiSuhu {
    public static void main(String[] args) {
//        Deklarasi variable
        int fDouble;
        int fFloat;
        int fInteger;
        Scanner inputSuhu;
        inputSuhu = new Scanner(System.in);
//        Memasukan Scanner
        System.out.println("Masukan nlai fahrenheit untuk double : ");
        fDouble = inputSuhu.nextInt();
        System.out.println("Masukan Nilai Fahrenheit untuk Floatt : ");
        fFloat = inputSuhu.nextInt();
        System.out.println("Masukan nilai fahrenheit untuk integer : ");
        fInteger = inputSuhu.nextInt();
//        Memanggil function
        System.out.println(fungsiDouble(fDouble));
        System.out.println(fungsiFloat(fFloat));   
        System.out.println(fungsiInteger(fInteger));  
        
    }
    public static double fungsiDouble(double input) {
        return ( input - 32 ) * 5 / 9;
    }
    public static float fungsiFloat(float input) {
        return (input - 32) * 5 / 9;
    }
    public static int fungsiInteger(int input) {
        return (input - 32) * 5 / 9;
    }
}
