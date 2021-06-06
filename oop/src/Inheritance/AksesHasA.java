/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

class Car {
    
    void showHalo() {
        System.out.println("Halo dari kelas car nih");
    }
}

class Avanza {
    Car c;
    
    Avanza() {
        c = new Car();
    }
    
    void showHaloAvanza() {
        System.out.println("Halo from avanza");
    }
    
    void showHaloFromCar() {
        c.showHalo();
    }
    
    
}
public class AksesHasA {
    public static void main(String[] args) {
        Avanza a = new Avanza();
        a.showHaloAvanza();
        a.showHaloFromCar();
    }
}
