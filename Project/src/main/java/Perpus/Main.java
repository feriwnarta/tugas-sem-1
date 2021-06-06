/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perpus;

import java.util.Scanner;

/**
 *
 * @author Feri Winarta
 */


public class Main {
    public static void main(String[] args) {
        Scanner cInput = new Scanner(System.in);
        String[] buku = {"asd","ades","asda"};
        
        System.out.println("Apakah anda ingin tambah buku y/n");
        char input = cInput.next().charAt(0);
        
        String[]bukuBaru = tambahBuku(buku);
        for(String data : bukuBaru) {
            System.out.println(data);
        }
    }
    
    static String[] tambahBuku(String[]buku) {
        Scanner cInput = new Scanner(System.in);
        
        System.out.println("Masukan nama buku");
        String namaBuku = cInput.nextLine();
        
        byte tambah = (byte) (buku.length + 1);
        
        String[] bukuBaru = new String[tambah]; 
        for(int i = 0; i < bukuBaru.length; i++) {
            if(i < buku.length){
                bukuBaru[i] = buku[i];
            } else if(buku.length == i) {
                bukuBaru[i] = namaBuku;
            } else {
                System.out.println("eror");
            }
        }
        return bukuBaru;
    }
}
