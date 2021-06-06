/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lanjut;

import java.util.Arrays;
import java.util.Scanner;

public class SortCharacter {
    public static void main(String[] args) {
        String data = "sample case";
        String[] data2 = data.split("");
        String[] vowel = {
            "a","i","u","e","o"
        };
//        System.out.println("contoh : " + data);
//        String vowel2 = "";
//        String consonant = "";
//        for(int i = 0; i < data2.length; i++) {
//            for(int j = 0; j < vowel.length; j++) {
//                if(vowel[j].contains(data2[i])) {
//                    System.out.println(data2[j]);
//                } else {
//                    
//                }
//            }
//        }
//        
//        System.out.println("Vowel Case : " + vowel2);
//        System.out.println("Consonant Case : " + consonant);
        
        for(int i = 0; i < data2.length; i++) {
            if(data2[i].contains("a") || data2[i].contains("i") || 
                data2[i].contains("u") || data2[i].contains("e") || 
                data2[i].contains("o")) {
                System.out.println(data2[i]);
            }
        }
        
        
        
        
//        System.out.println("");
//        Scanner cInput = new Scanner(System.in);
//        System.out.println("Masukan kata yang akan diambil konsonannya :");
//        String input = cInput.nextLine();
//        
//        String[] slice = input.split("");
//        
//        
//        for(int i = 0; i < vowel.length; i++) {
//            for(int j = 0; j < slice.length; j++) {
//                if(slice[j].contains(vowel[i])) {
//                    System.out.print(slice[j]);
//                } else {
//                    System.out.println(slice[j]);
//                }
//            }
//        } 
//        System.out.println("");
      
        

    }
}
