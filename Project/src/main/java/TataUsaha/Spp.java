/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TataUsaha;

import java.util.Scanner;

public class Spp {
    Scanner cInput = new Scanner(System.in);
    private String[] nama = {"feri","sanudin","ucup","sotong","santi"};
    private int[] db_feri = {1,1,1,1,1,0};
    private int[] db_sanudin = {1,1,1,1,1,0};
    private int[] db_ucup = {1,1,1,1,0,0};
    private int[] db_sotong = {1,1,1,1,1,1};
    private int[] db_santi = {1,1,1,1,1,1};
    String input;
    String db_name;
    String loop;
    
  void display() { 
      while(true) {
            System.out.println("Masukan nama : ");
            input = cInput.next();
            switch(input) {
                case "feri" :
                    showData(input,db_feri);
                    break;
                case "sanudin" :
                    showData(input,db_sanudin);
                    break;
                case "ucup" :
                    showData(input,db_ucup);
                    break;
                case "sotong" :
                    showData(input,db_sotong);
                    break;
                case "santi" :
                    showData(input,db_santi);
                    break;
                default :
                    System.out.println("Nama salah");
                    break;
            }
            System.out.println("Apakah anda ingin mengulang ? [y / n]");
            loop = cInput.next();
            if(loop.equalsIgnoreCase("n")) {
                break;
            }
      }
      
  }
  
  void showData(String input,int[]db) {
//      cek nama ada di databse
      int data = 0;
      
      for(int i = 0; i < nama.length; i++) {
          if(input.equalsIgnoreCase(nama[i])) {
              data = i + 1;
          } 
      }
//      bikin araay bulan untuk ditampilkan
      String[] bulan = {"januari","Februari","Maret","april","mei","juni"};
      
//      riwayat pembayaran   
      if(data != 0) {
          for(int i = 0; i < db.length; i++) {
              if(db[i] == 1) {
                  System.out.println("Bulan " + bulan[i] + " Sudah Lunas Rp. 450.000");
              } else if(db[i] == 0) {
                  System.out.println("Bulan " + bulan[i] + " belum dibayar");
              } else {
                  System.out.println("System Sedang Error");
              }
          }
      } else {
          System.out.println("Nama Yang anda Masukan Salah");
      }
//      jika ingin bayar
     bayarSpp(db,bulan);
      
  }
  
  void bayarSpp(int[] db, String[] bulan) {
      for(int i = 0; i < db.length; i++) {
         if(db[i] == 0) {
             System.out.println("apakah anda ingin bayar spp "
                     + "bulan " + bulan[i] + " ? [ y / N ]");
             input = cInput.next();
             if(input.equalsIgnoreCase("y")) {
                 db[i] = 1;
                 System.out.println("spp bulan " + bulan[i] + " sudah dibayar");
             } else {
                 System.out.println("Tidak jadi Bayar");
             }
         }
     }
  }
  
 
  
  
  
  
}
