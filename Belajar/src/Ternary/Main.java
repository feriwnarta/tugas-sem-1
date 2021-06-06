/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ternary;

import java.util.Scanner;

/**
 *
 * @author Feri Winarta
 */

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static int id;
    private static int pass;
    
    public static void main(String[] args) {
        
        Main m = new Main();
        
        System.out.println("Masukan id ");
        id = input.nextInt();
        System.out.println("Masukan Password ");
        pass = input.nextInt();
        
        boolean login = (id == 123 && pass == 321) ? true : false;
        
        System.out.println(login);
        
        
        
        
        
    }
}
