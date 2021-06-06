/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

class Benda {
    String name;
    String merek;
    int berat;
    
    void setBenda(String name) {
        this.name = name;
    }
    
    void setBenda(String name, String merek) {
        this.name = name;
        this.merek = merek;
    }
    
    void setBenda(String name, String merek, int berat) {
        this.name = name;
        this.merek = merek;
        this.berat = berat;
    }
    
    void setBenda(int berat) {
        this.berat = berat;
    }
    
    void setBenda() {
        System.out.println("default");
    }
    
}
public class Poly_Statis {
    public static void main(String[] args) {
        Benda b = new Benda();
        b.setBenda("Feri", "IKEA");
        
    }
}
