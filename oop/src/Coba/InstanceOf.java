/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coba;

class Car {
    private String name;
    
    protected void run() {
        System.out.println("car " + name + " is run" );
    }
}

class Avanza {
    private String name;
    
    Avanza() {
        name = "avanza";
    }
    
    public void run() {
        System.out.println("car " + name + " is run");
    }
}


public class InstanceOf {
    public static void main(String[] args) {
        
        Car c = new Car();
        Avanza a = new Avanza();
        
        InstanceOf f = new InstanceOf();
        if(f instanceof Object) {
            System.out.println("benar");
        } else {
            System.out.println("salah");
        }
        
//        if(a instanceof Car) {
//            System.out.println("benar");
//        } else {
//            System.out.println("salah");
//        }
        
    }
}
