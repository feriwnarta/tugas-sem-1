/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Uas;
import java.util.Scanner;
import java.util.Arrays;
import java.io.*;
/**
 *
 * @author Feri Winarta
 */
public class Main {
    public static void main(String[] args)throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("\n----------------------------------");
        System.out.println("|=======Ujian Akhir Semester=====|");
        System.out.println("----------------------------------");
        System.out.println("Algoritma Pemrograman");
        System.out.println("Aplikasi Pendapatan Sipjek");
        String nama;
        System.out.println("Masukan Nama anda = ");
        nama = input.nextLine();
       
//        array data
        String[] namaUser = null;
        int[] layanan = null;
        String[] diskon = null;
        int[] jarak = null;
//        Case        
        int pilihan;
        boolean ulang = true;
        while(ulang) {
            int menu = menu(nama);
            switch(menu) {
            case 1 : 
                System.out.println("Masukan jumlah Penumpang : ");
                pilihan = input.nextInt();
                namaUser = new String[pilihan];
                layanan = new int[pilihan];
                diskon = new String[pilihan];
                jarak = new int[pilihan];
                    for(int i = 0; i < pilihan; i++) {
                        System.out.println("Nama Penumpang ke : " + (i+1));
                        namaUser[i] = input.next();
                        System.out.println("Pilih layanan [1 / 2] : ");
                        layanan[i] = input.nextInt();
                        System.out.println("Diskon [Y / N] : ");
                        diskon[i] = input.next();
                        System.out.println("Masukan jarak tempuh : ");
                        jarak[i] = input.nextInt();
                    } 
                break;
             case 2 : 
                pilihan2(namaUser,layanan,diskon,jarak);
                break;
             case 3 : 
                 System.out.println("SORTING BELUM");
                 break;
             case 4 : 
                 cetak(namaUser,layanan,diskon,jarak);
                 break;
             case 5 : 
                 break;
            } 
            System.out.println("Apakah anda ingin melanjutan ? [Y / N] ");
            String a = input.next();
            if(a.equalsIgnoreCase("y")) {
                ulang = true;
            } else { 
                break;
            }
                
        }
         
    }
    static void pilihan2(String[]namaUser, int[]layanan, String[]diskon,int[]jarak) {
       try {
        float[] biaya = biaya(layanan,diskon,jarak);
        float total = 0;
        for(int i = 0; i < biaya.length; i++) {
            total += biaya[i];
        }
        total = total * 10 / 100;
        
        System.out.println("\t\tDaftar Transaksi Layanan");
        System.out.println("\t\tSIPRIDE dan SIPFOOD");
        System.out.println("===================================================================================================");
        System.out.println("No\tNama\t\tLayanan\t\t\tDiskon\t\tJarak\t\tBiaya");
        String[] food = new String[layanan.length];
        for(int i = 0; i < namaUser.length; i++) {
            if(layanan[i] == 1) {
                food[i] = "SIPRIDE";
            } else {
                food[i] = "SIPFOOD";
            }
            System.out.print((i + 1) + "\t");
            System.out.print(namaUser[i] + "\t\t");
            System.out.print(food[i] + "\t\t\t");
            System.out.print(diskon[i] + "\t\t");
            System.out.print(jarak[i] + "\t\t   ");
            System.out.println(biaya[i]);

        }
        System.out.println("===================================================================================================");
        System.out.println("\t\t\t\t\t\t" + total);
       } catch(Exception e) {
           System.err.println("data belum diinput");
       }
    }
    static int menu(String nama) {
        Scanner input = new Scanner(System.in);
        int userInput;
        System.out.print("\n");
        System.out.println("Selamat datang " + nama + "\nProgram Pendataan Sipjek \n"
                + "Menu Utama : \n"
                + "1. Input Data \n"
                + "2. Tampil Data \n"
                + "3. Sort Data \n"
                + "4. Cetak \n"
                + "5. Extt \n" 
                + "Masukan Pilihan Menu [1-5] : ");
        userInput = input.nextInt();
        return userInput;
    }
    static float[] biaya(int[]layanan,String[]diskon,int[]jarak) {
        float[] total = new float[layanan.length]; 
        for(int i = 0 ; i < layanan.length; i++) {
            if(layanan[i] == 1) {
                    total[i] = jarak[i] * 10000;
                } else {
                    total[i] = jarak[i] * 15000;
                }
        }
        return total;
    }
    static void cetak(String[]namaUser, int[]layanan, String[]diskon,int[]jarak)throws IOException {
       try {
        FileWriter writeFile = new FileWriter("Laporan.txt");
        
        writeFile.write("\t\tDaftar Transaksi Layanan");
        writeFile.write("\t\tSIPRIDE dan SIPFOOD");
        writeFile.write("===================================================================================================");
        writeFile.write("No\tNama\t\tLayanan\t\t\tDiskon\t\tJarak\t\tBiaya");
        String[] food = new String[layanan.length];
        float[] biaya = biaya(layanan,diskon,jarak);
        for(int i = 0; i < namaUser.length; i++) {
            if(layanan[i] == 1) {
                food[i] = "SIPRIDE";
            } else {
                food[i] = "SIPFOOD";
            }
            writeFile.write((i + 1) + "\t");
            writeFile.write(namaUser[i] + "\t\t");
            writeFile.write(food[i] + "\t\t\t");
            writeFile.write(diskon[i] + "\t\t");
            writeFile.write(jarak[i] + "\t\t   ");
            writeFile.write((int) biaya[i]);
        }
        writeFile.write("===================================================================================================");
    } catch(Exception e) {
           System.err.println("Data belum diinput");
    } 
}
}


