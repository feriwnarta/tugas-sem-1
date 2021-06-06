/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Louiss Figo
 */
package com.latihan.Tugas6;
public class pert6no3 {
    
    public static void main(String[] args) {
        System.out.println("Hasil Fahrenheit");
        System.out.println("----------------");
        nilaidouble ();
        nilaifloat ();
        nilaiinteger ();
        
    }
    public static void nilaidouble () {
        double nilai=100;
     
        System.out.println("pemanggilan dengan tipe data double");
        System.out.println("proses dengan tipe data double");
        System.out.println("100 sama dengan " + (nilai-32) * 5/9  );
        System.out.println("");
    }
    
  public static void nilaifloat () {
      float nilai=100;
      
        System.out.println("pemanggilan dengan tipe data float");
        System.out.println("proses dengan tipe data float");
        System.out.println("100 sama dengan " + (nilai-32) * 5/9  );
        System.out.println("");
  }
  
  public static void nilaiinteger () {
      int nilai=100;
      
        System.out.println("pemanggilan dengan tipe data integer");
        System.out.println("proses dengan tipe data integer");
        System.out.println("100 sama dengan " + (nilai-32) * 5/9  );
  }
}
