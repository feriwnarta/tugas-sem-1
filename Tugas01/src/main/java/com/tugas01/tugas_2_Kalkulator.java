package com.tugas01;
import java.util.Scanner;
public class tugas_2_Kalkulator {
 public static void main(String[] args) {
 Scanner input = new Scanner( System.in );
 int angka1; // untuk angka ke satu
 int angka2; // untuk angka ke dua
 int jum; // untuk hasil penjumlahan

System.out.print( "Masukan angka ke 1: " ); // prompt
 angka1 = input.nextInt(); // baca nagka ke 1 dari user
 System.out.print( "Masukan angka ke 2: " ); // prompt
 angka2 = input.nextInt(); // baca angka ke 2 dari user
 jum = angka1 + angka2;
// jumlahkan angka, kemudian masukan ke jumlah
 System.out.printf( "Jumlahnya adalah : %d\n", jum );
// Tampilkan Hasil
 }
}

