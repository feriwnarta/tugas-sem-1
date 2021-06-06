/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konvversi_string_wrapper_class;

public class Main {
    public static void main(String[] args) {
        String strAngka = "5";
        int kali = 2;
//        Konversi String menjadi int
        int konversi = Integer.parseInt(strAngka);
        System.out.println("HASIL KONVERSI " + konversi);
        int total = konversi * kali;
        System.out.println("HASIL KALI " + total);
 
    }
}
