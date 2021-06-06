/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.latihan.tugas03;

/**
 *
 * @author Feri Winarta
 */
import java.util.Scanner;

    public class RataRata {
        public static void main(String[] args) {
            Scanner nilai;
            nilai = new Scanner(System.in);
            
//            deklarasi variabel
            String nama;
            int nilai1, nilai2, nilai3;
            
//            Memasukan Inputa
            System.out.println("======PROGRAM HITUNG NILAI RATA-RATA======");
                System.out.println("Masukan Nama Anda = ");
                nama = nilai.nextLine();
                System.out.println("Masukan Nilai Pertandigan 1 = ");
                nilai1 = nilai.nextInt();
                System.out.println("Masukan Nilai Pertandinga 2 = ");
                nilai2 = nilai.nextInt();
                System.out.println("Masukan Nilai Pertandigan 3 = ");
                nilai3 = nilai.nextInt();
                
//                penghitungan nilai
            
             int rataRata = (nilai1 + nilai2 + nilai3) / 3;
          
             String hasil;
             if(rataRata >= 85) {
                hasil = "Selamat anda mendapatkan hadiah Komputer";
            } else if(rataRata >=70) {
                hasil = "Selamat anda Mendapatkan Uang tunai Sebesar Rp.500.000,-";
            } else {
                hasil = "Selamat anda mendapatkan hadiah hiburan";
            }
//             Mencetak Output
            System.out.printf("siswa yang bernama %s \n",nama);
            System.out.printf("Memperoleh nilai rata-rata %d dari hasil perlombaan yang "
                    + "diikutinya \n",rataRata);
            System.out.println("Hadiah yang didapat adalah " + hasil);
//            
        
    }
}
