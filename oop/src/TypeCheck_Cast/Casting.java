/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TypeCheck_Cast;

class Vehicle {
    String merek;
    
}

class Car extends Vehicle {
    
    Car(String merek) {
        super.merek = merek;
    }
    
}

class Plane {
   
}

public class Casting {
    public static void main(String[] args) {
        Vehicle v =  new Vehicle();
        Car c = (Car) v;
        
    }
    
}
