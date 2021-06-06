/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractKelas;

abstract class Animal {
    String name;
    
    abstract void run();
    
    
}

class Cat extends Animal{
    void run() {
        System.out.println("Cat " + super.name + " is Run");
    }
    
    
}


class Anj {
    protected String name;
}

class Anj2 extends Anj {
    void shownName() {
        System.out.println(super.name);
    }
}

public class KelasAbstract {
    public static void main(String[] args) {
        Animal an = new Cat();
        an.name = "Meow";
        an.run();
        
        
        
    }
}
