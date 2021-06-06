///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.latihan.belajar;
//
///**
// *
// * @author Feri Winarta
// */
//
//public class Konstruktor {
//    
//    int x = 10;
//    
//    public void metode() {
//        System.out.println("konstruktor " + x);
//    }
//    
//    public Konstruktor() {
//        x = 15;
//    }
//    
//    
//    
//    public static void main(String[] args) {
//        
//        Konstruktor objekKonst = new Konstruktor();
//        objekKonst.metode();
//        
//        Konstruktor objekBaru = new Konstruktor();
//        objekBaru.x = 10;
//        System.out.println(objekBaru.x);
//        
//        
//       
//    }
//    
//}

package com.latihan.belajar;

    public class Konstruktor {
        String nama;
        int nilai;
        
        public Konstruktor(String nama2, int x){
            
           nama = nama2;
           nilai = x;
        }
        public static void main(String[] args) {
            Konstruktor baru = new Konstruktor("feri", 10);
            System.out.println(baru.nama + baru.nilai);
        }
    }