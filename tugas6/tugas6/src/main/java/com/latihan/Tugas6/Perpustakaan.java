/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.latihan.Tugas6;

/**
 *
 * @author Feri Winarta
 */
import java.util.Scanner;
public class Perpustakaan {
    public static void main(String[] args) {
//       deklarasi variable
       String nama;
       char buku;
       int banyak;
       Scanner inputUser;
       inputUser = new Scanner(System.in);

//       menampilkan harga
            System.out.println("Kode buku = "
                    + "C, K, N");
            System.out.println("Jenis Buku = "
                    + "Cerpen, Komik, Novel");
            System.out.println("Tarif Buku = "
                    + "5000, 7000, 10.000");


//       menerima inputan user
            System.out.println("============================");
            System.out.println("Perpustakaan kecil - kecilan");
            System.out.println("Masukan Nama = " );
            nama = inputUser.next();
            System.out.println("Masukan Kode Buku [c,k,n]");
            buku = inputUser.next().charAt(0);
            System.out.println("Masukan banyak pinjaman");
            banyak = inputUser.nextInt();
            System.out.println("=============================");
            
           System.out.println("tarif sewa Rp. " + hargaBuku(buku));
           jenisBuku(buku);
           keluaran(nama, buku, banyak);
            
    }
    
//    membuat fungsi tarif
    public static int hargaBuku(char kode) {
        int total = 0;
        if(kode == 'c' || kode == 'C') {
            total = 5000;

        } else if(kode == 'k' || kode == 'K') {
            total = 7000;

        } else if(kode == 'n' || kode == 'N') {
            total = 10000;

        } else {
            System.out.println("Kode salah");
        }
        return total;
    }
    
//    membuat fungsi tarif
     public static int tarifSewa(char jenis, int banyak) {
         int hasil = 0;
        
         hasil = hargaBuku(jenis) * banyak;
        
         return hasil;
     }
//     fungsi jenis buku
     public static void jenisBuku(char kode) {
         String hasil;
         if(kode == 'c' || 'c' == kode) {
             hasil = "Cerpen";
             System.out.println("Jenis Buku : " + hasil);
         } else if(kode == 'k' || kode == 'K') {
             hasil = "Komik";
             System.out.println("Jenis Buku : " + hasil);
         } else if(kode == 'n' || kode == 'N' ) {
             hasil = "Novel";
             System.out.println("Jenis Buku : " + hasil);
         }
     
     }
//     fungsi output
     public static void keluaran(String nama ,char jenis, int banyak) {
         System.out.println("Penyewa dengan nama = " + nama);
         System.out.println("jumlah penyewaan sebesar Rp. " + tarifSewa(jenis,banyak));
     }
     
     
    
    
    
    
}
