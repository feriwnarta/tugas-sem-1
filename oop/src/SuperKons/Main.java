/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SuperKons;

class Manager {
    private String name;
    private int salary;
    
    Manager(String name, int salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("konstruktor super");
    }
    
    
}

class VicePresident extends Manager{
    
    VicePresident(String name, int salary) {
        super(name,salary);
    }
    
    
}

public class Main {
    public static void main(String[] args) {
        VicePresident vp = new VicePresident("agung",3000);
        
    }
}
