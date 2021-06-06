/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author Feri Winarta
 */

class Console {
     static String message;
     int x = 10;
     
    static void log(String message) {
        System.out.println(message);
    } 
}
public class NewClass {
    public static void main(String[] args) {
        Console.log("halo");
    }
}
