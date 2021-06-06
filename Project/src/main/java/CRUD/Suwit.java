/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CRUD;

import java.util.Scanner;

/**
 *
 * @author Feri Winarta
 */
public class Suwit {
    private Scanner input;
    private String userInput1;
   
    void display() {
        input = new Scanner(System.in);
        System.out.println("selamat datang diaplikasi catur");
        System.out.println("Pilihan user, Batu , Gunting, Kertas : ");
        userInput1 = input.next();
        
        String benar = " ";
        String random = randomAngka();
        switch(userInput1) {
            case "batu" : 
                benar = (random.equals("batu")) ? "seri" : "seri";                
                benar = (random.equals("gunting")) ? "menang" : "kalah";
                benar = (random.equals("kertas")) ? "kalah" : "seri";
                break;
            case "gunting" :
                benar = (random.equals("batu")) ? "kalah" : "kalah";                
                benar = (random.equals("gunting")) ? "seri" : "seri";
                benar = (random.equals("kertas")) ? "menang" : "seri";
                break;
            case "kertas" :
                benar = (random.equals("batu")) ? "Menang" : "menang";                
                benar = (random.equals("gunting")) ? "kalah" : "kalah";
                benar = (random.equals("kertas")) ? "seri" : "seri";
                break;
            default :
                System.out.println("Kode anda salah");
        }
        
        System.out.println("anda memilih : " + userInput1);
        System.out.println("Komputer memilih : " + random);
        
        System.out.println("jawabannya anda : " + benar);
        
    }
    
    
    
    String randomAngka() {
        String hasil;
        if(Math.random() >= 0.1 && Math.random() <= 0.3) 
            hasil = "batu";
        else if(Math.random() >= 0.4 && Math.random() <= 0.7 ) 
            hasil = "kertas";
        else 
            hasil = "gunting";
        return hasil;
    }
    
    public static void main(String[] args) {
        
        Suwit oraSuwit = new Suwit();
        oraSuwit.display();
        
        
        
    }
}
