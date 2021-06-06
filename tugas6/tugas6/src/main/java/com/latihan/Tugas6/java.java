/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.latihan.Tugas6;

import java.util.Scanner;
/**
 *
 * @author Louiss Figo
 */
public class java {
    public static void main(String[] args) {
        //variablel
        char kode;
        int k;
        int n;
        String nama;
        
//scanner
        Scanner input = new Scanner(System.in);
        
        System.out.println("perpustakaan kecil kecilan");
        
        System.out.println("===========================");
        
//        input nama
        System.out.println("Masukan nama penyewa buku");
        nama = input.next();
        System.out.println("Kode buku (C/K/N");
        kode = input.next().charAt(0);
        System.out.println("Banyak pinjaman");
        k = input.nextInt();
        
//        mencetak tarif sewa dengan funsi
            System.out.println("tarif sewa Rp. " + tarifSewa(kode));

//        mencetak jenis buku
        switch(kode)  {
            case 'c' :
            case 'C' :
                System.out.println("Jenis buku : Cerpen");
                break;
            
            case 'k' :
            case 'K' :
                System.out.println("Jenis buku : Komik");
                break;
                
            case 'n' :
            case 'N' :
                System.out.println("Jenis Buku : Novel");
                break;
                
            default : 
                System.out.println("kode salah bos");
                break;   
        }
        
//        mencetak nama penyewa dan jumlah bayar penyewaan
            System.out.println("Penyewa dengan nama =" + nama);
            jumlahBayar(kode, k);
    }

        public static int tarifSewa(char input) {
            int total = 0;
            if (input == 'c' || input == 'C') {
                total = 5000;
            } else if (input == 'k' || input == 'K') {
                total = 7000;
            } else if( input == 'n' || input == 'N') {
                total = 10000;
            } else {
                System.out.println("Kode salah");
            }
            return total;
        }
        
//        membuat fungsi jumlah bayar
        
        public static void jumlahBayar(char input, int banyak) {
            int total = 0;
            total = tarifSewa(input) * banyak;
            System.out.println("jumlah bayar penyewaan sebesar =" + total);
        }
        
        
        
    }
    
