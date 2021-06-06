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

//class polos {
//    String nama;
//    String nim;
//    String usia;
//    String data;
//    
//}

class Mahasiswa {
    String nma;
    int nim;
    String kode1;

    Mahasiswa(String nama, String kode) {
       nma = nama;
       kode1 = kode;
        System.out.print(nma + "\t");
        System.out.println(kode1);
    }
}


public class NewClass {

    
    public static void main(String[] args) {

        Mahasiswa objekMhs = new Mahasiswa("feriWinarta","123"); 
        Mahasiswa objekMhs1 = new Mahasiswa("Pju", "1234");
        
        
        
//        Mahasiswa mahasiswa = new Mahasiswa();
        
        
        
        
        
//            polos objekPolos = new polos();
//            
//            objekPolos.nama = "feri Winarta";
//            objekPolos.nim = "2020100041";
//            objekPolos.data = "ckzxcv";
//            
//            System.out.println("nama anda adalah " + objekPolos.nama);
//            System.out.println(objekPolos.nim);
//            System.out.println(objekPolos.data);
//            
//            polos objekPolos2 = new polos();
//            objekPolos2.nama = "figo";
//            System.out.println(objekPolos2.nama);
//            System.out.println(objekPolos2.nim);
//
//        NewClass objekNama = new NewClass();
//        objekNama.feri("FeriWinarta");
//        nama("feri");
//        Mahasiswa mahasiswa1 = new Mahasiswa();
//        mahasiswa1.nama = "feri Winarta";
//        mahasiswa1.nim = 2020100041;
//        System.out.println(mahasiswa1.nama);
//        System.out.println(mahasiswa1.nim);
    }
}
