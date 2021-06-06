/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.latihan.tutorial08;

/**
 *
 * @author Feri Winarta
 */
import java.util.Scanner;
public class Uts {
    public static void main(String[] args) {
        String nama;
        int pilihan;
        String ulang = "y";
        String hero;
        String pilihan2;
        String pilihan3;
        Scanner input = new Scanner(System.in);
        
            System.out.println("Arena of buddhi");
            System.out.println("Masukan nama = ");
            nama = input.next();
            System.out.println("Selamat Datang diAplikasi AOB, " + nama);
            System.out.println("Masukan type hero : \n"
                    + "1. Archer\n"
                    + "2. Tanker\n");
                while(ulang.equalsIgnoreCase("y")) {
                    System.out.println("Masukan pilihan hero (1 / 2)");
                    pilihan = input.nextInt();
                        if (pilihan == 1) {
                            System.out.println("Masukan Skill hero");
                            hero = input.next();
                            System.out.println("");
                            pilihan1(nama,hero);
                            System.out.println("apakah anda ingin bermain lagi (y / n)"); 
                               pilihan2 = input.next();
                                    if(pilihan2.equalsIgnoreCase("y")) {
                                        ulang = "y";
                                    } else {
                                        break;
                                    }    
               
                                
                        } else if(pilihan == 2) {
                            System.out.println("Masukan Skill hero");
                            hero = input.next();
                            pilihan2(nama,hero);
                            
                                System.out.println("apakah anda ingin bermain lagi (y / n)"); 
                               pilihan2 = input.next();
                                    if(pilihan2.equalsIgnoreCase("y")) {
                                        ulang = "y";
                                    } else {
                                        break;
                                    }    
                           
                               
                        } else if(pilihan != 1 || pilihan != 2) {
                            System.out.println("kode yang anda masukan salah, silahkan pilih kembali");
                            continue;
                        }
                }
            
    }
    
//    fungsi
    public static void pilihan1(String nama, String hero) {

        System.out.println("=====Informasi Hero=====");
        System.out.println("hero anda Archer");
        System.out.println("tipe hero anda adalah jarak jauh");
        System.out.println("hero jenis ini memiliki kemampuan " + hero);
        System.out.println("Terima kasih " + nama.toUpperCase() + " Telah menggunakan layanan kami !");
       
    }
    
    public static void pilihan2(String nama, String hero) {
        System.out.println("=====Informasi Hero=====");
        System.out.println("hero anda Tanker");
        System.out.println("tipe hero anda adalah jarak dekat");
        System.out.println("hero jenis ini memiliki kemampuan " + hero);
        System.out.println("Terima kasih " + nama.toUpperCase() + " Telah menggunakan layanan kami !");
    }
}
