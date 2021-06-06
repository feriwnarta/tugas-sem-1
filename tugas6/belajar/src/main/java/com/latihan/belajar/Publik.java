/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.latihan.belajar;

/**
 *
 * @author Feri Winarta
 */
public class Publik {
    
//    metode publik dipanggil harus dengan menyisipkan didalam objek baru di main method
//    membuat metode public
    public int publik() {
        int x = 5;
        return x;
    }
    
//    method static bisa dipanggil tanpa menggunakan objek
//    membuat metode static
    static void contohStatik() {
        System.out.println("Ini adalah statik");
    }
    
    static void statik2 () {
        System.out.println("Hallo");
    }
    
    public static void main(String[] args) {
//        panggil static
        contohStatik();
//        panggil publik
//      publik harus dipanggil didalam objek
        Publik objekPublik = new Publik();
        
     
      
        System.out.println("ini adalah " + objekPublik.publik());
        objekPublik.publik();
        
        int x = 20;
        
        
        System.out.println(x);
    
    }
    
    
    
    
}
