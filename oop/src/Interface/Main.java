/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.util.Scanner;

/**
 *
 * @author Feri Winarta
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Phone p = new Xiaomi();
        
        while(true) {
            System.out.println("Opsi User : ");
            System.out.println("1. Nyalakan Hp" );
            System.out.println("2. Volume Up");
            System.out.println("3. Volume Down");
            int value = input.nextInt();
            pilihan(value,p);
            System.out.println("Apakah ingin mengulang : 1 / 2");
            int pick = input.nextInt();
            if(pick == 2) {
                break;
            } 
        }
        
            
            
    }
    
    static void pilihan(int value, Phone p) {
        switch(value) {
                case 1 : 
                    p.powerButton();
                    break;
                case 2 : 
                    p.volumeButtonUp();
                    break;
                case 3 : 
                    p.volumeButtonDown();
                    break;
                case 4 : 
                    p.powerButton(false);
                    break;
                default :
                    System.out.println("input salah");
                    break;
            }
    }
}
