/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugas07;

/**
 *
 * @author Feri Winarta
 */
public class Overload {
    
    void kali(int a) {
        System.out.println(a * a);
    }
    
    void kali(int a, int b) {
        System.out.println(a * b);
    }
    
    int kali(int a, int b, int c) {
        return a*b*c ;
    }
    
    public static void main(String[] args) {
        
    }
}
