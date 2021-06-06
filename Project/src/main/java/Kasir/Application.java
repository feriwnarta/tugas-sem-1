/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kasir;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Feri Winarta
 */
public class Application {
    private Scanner cInput = new Scanner(System.in);
    private String username1 = "tokojaya";
    private String password1 = "admin";
    private boolean log;
    protected String[] barang = new String[2];
    protected int[]quantity = new int[2];
    private char pick;
    
    // database sementara
    float Super = 19.000f;
    float pilter = 19.000f;
    float mild = 24.000f;
    
    
    void login() {
        
        // login
        System.out.println("===========================");
        System.out.println("Selamat Datang Ditoko darma");
        System.out.println("===========================");
        System.out.println("***********Login***********");
        System.out.println("===========================");
        System.out.println("username : ");
        String username = cInput.nextLine();
        System.out.println("password : ");
        String password = cInput.nextLine();
        
        // cek username dan password
        
        if(log = username1.equalsIgnoreCase(username) 
        && (password1.equalsIgnoreCase(password))) {
            System.out.println("Selamat datang admin1");
        } else {
            System.out.println("username atau password salah");
        }
        
        // tampilan menu
        if(log) {
            opsi();
        }
        
        
    }
    
    private int menu() {
        System.out.println("============================");
        System.out.println("1. Pembayaran otomatis / barcode");
        System.out.println("2. Pembayaran pencarian manual");
        System.out.println("Pilihan : ");
        int pilihan = cInput.nextInt();
        return pilihan;
    }    
    
    private void opsi() {
        int userInput = menu();
        
        switch(userInput) {
            case 1 :
                otomatis();
                break;
            case 2 :
                //case 2
                break;
            default : 
                System.out.println("Salah nih bos");
                break;
        }
    }
    
    private void otomatis() {
        // scan barcode
        // karena barcodenya tidak ada maka anggap console seperti barkode
        System.out.println("Scan barcode : ");
        isiData();
        System.out.println("Cetak ? ");
        pick = cInput.next().charAt(0);
        
        if(pick == 'y') cetak();  
       
    }
   
    void isiData() {
        for(int i = 0; i < barang.length; i++) {
            System.out.println("Barang ke - " + (i+1));
            barang[i] = cInput.next();
            System.out.println("quantity : ");
            quantity[i] = cInput.nextInt();
        }
    }
    
    void cetak() {
        try {
            dataCetak();
        }catch(IOException e) {
            System.out.println(e);
        }
    }
    
  void dataCetak() throws IOException{
        FileWriter write = new FileWriter("cetak.txt");
        BufferedWriter buff = new BufferedWriter(write);
        
        System.out.println("\t\tTOKO JAYA");
        System.out.println("\n\n");
        System.out.println("NO    : ");
        System.out.println("Pel   : CASH 2");
        System.out.println("Sales : ");
        System.out.println("----------------------------------------------");
        cetakData();
        System.out.println("----------------------------------------------");
        System.out.println("Bayar : ");
        String bayar = cInput.next();
        System.out.println("Tunai  : \t\t" + bayar);
        System.out.println("kembali: \t\t" + "null");
        System.out.println("barang yang telah dibeli tidak dapat\n"
                + "dikembalikan kecuali ada perjanjia");
    }
  
  void cetakData() {
      for(int i = 0; i < barang.length; i++) {
          if(barang[i].equalsIgnoreCase("pilter")) {
              System.out.println(barang[i]);
              System.out.printf(quantity[i] + "     x" + pilter + "\t\t" + totalHarga() + "\n");
          } else if(barang[i].equalsIgnoreCase("mild")) {
              System.out.println(barang[i]);
              System.out.print(quantity[i] + "     x " + mild + "\t\t" + totalHarga() + "\n");
          }
      }
  }
  
  float totalHarga() {
      float total = 0;
      for(int i = 0; i < barang.length; i++) {
          if(barang[i].equalsIgnoreCase("pilter")) {
            total =+ (pilter * quantity[i]);
          } else if(barang[i].equalsIgnoreCase("mild")){
              total =+ (mild * quantity[i]);
          }
      }
      return total;
  }
    
}

