/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_Objke;



class Manager {
    String name;
    
    Manager(String name) {
        this.name = name;
    }
}
      

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager("Feri");
        System.out.println(m);
        System.out.println(m.toString());
        
        
    }
}
