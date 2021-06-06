/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.latihan.tugas03;

import java.util.Scanner;

/**
 *
 * @author Feri Winarta
 */
public class AgenSusu1 {
    public static void main(String[] args) {
 
//       Daftar barang

            System.out.println("Toko kelontong keroncongan \n"
                    + "-------------------------\n"
                    + "Daftar Menu Susu\n"
                    + "A. Susu Dancow \n"
                    + "\t1. Ukuran Kecil\n"
                    + "\t2. Ukuran Sedang\n"
                    + "\t3. Ukuran Besar\n"
                    + "B. Susu Bendera\n"
                    + "\t1. Ukuran Kecil\n"
                    + "\t2. Ukuran Sedang\n"
                    + "\t3. Ukuran Besar\n"
                    + "C. Susu SGM\n"
                    + "\t1. Ukuran Kecil\n"
                    + "\t2. Ukuran Sedang\n"
                    + "\t3. Ukuran besar");
            
//      Membuat Scanner
                Scanner jenis;
                jenis = new Scanner(System.in);
                String barang;

                System.out.println("Masukkan jenis Susu Sesuai daftar menu (a,b,c)");
                barang = jenis.nextLine();
//                membuar Switch
                switch(barang)
                {
                case "A" :
                case "a" :
                System.out.println("Susu Dancow");
                break;

                case "B" :
                case "b" :
                System.out.println("Susu Bendera");
                break;
                
                case "C" :
                case "c" :
                System.out.println("Susu SGM");
                break;
                
                default :
                System.out.println("Anda Salah Memasukan Kode");
                break;
                }
                 
//                scanner bentuk


                Scanner bentuk;
                bentuk = new Scanner(System.in);
                int ukuran;
                 
                System.out.println("Masukan Ukuran Susu Sesuai Daftar Menu (1,2,3)");
                 ukuran = bentuk.nextInt();
            
                switch(ukuran) {
                case 1 :
                ukuran = 1;
                break;

                case 2 :
                ukuran = 2;
                break;
                
                case 3 :
                ukuran = 3;
                break;
                
                default :
                System.out.println("Anda Salah Memasukan Kode");
                break;
                }
//                konversi string
                String konversi = String.valueOf(ukuran);
                
                String gabung = barang + ukuran;
                
//              case harga barang

                int hasill;
               if(null == gabung) {
                   hasill = 22000;
               } else switch (gabung) {
            case "a1":
                hasill = 15000;
                break;
//             
            case "a2":
                hasill = 20000;
                break;
            case "a3":
                hasill = 25000;
                break;
            case "b1":
                hasill = 13500;
                break;
            case "b2":
                hasill = 17500;
                break;
            case "b3":
                hasill = 20000;
                break;
            case "c1":
                hasill = 15000;
                break;
            case "c2":
                hasill = 18500;
                break;
            default:
                hasill = 22000;
                break;
        }
               
              
               
        System.out.println("Harga satuan barang Rp. " + hasill + ",-");
        
//        scanner
        Scanner jumlah;
             jumlah = new Scanner(System.in);
              int jmlh;

              
              System.out.println("Masukan Jumlah yang dibeli :");
              jmlh = jumlah.nextInt();
              
              
              int totall = hasill * jmlh;
              System.out.println("Harga yang harus dibayar sebesar Rp. " + totall +",-" );
              
                
        }
}
   

            
                
               

            




