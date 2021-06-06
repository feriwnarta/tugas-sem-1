/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TypeCheck_Cast;

class Employe {
    protected String name;
    
    Employe(String name) {
        this.name = name;
    }
    
    void sayHi() {
        System.out.println("Halo Employe " + name );
    }
}

class Manager extends Employe {
    
    Manager(String name) {
        super(name);
    }
    
    void sayHi() {
        System.out.println("Halo Employe " + super.name );
    }
    
}

class Vice extends Employe{
    
    Vice(String name) {
        super(name);
    }
    void sayHi() {
        System.out.println("Halo Employe " + super.name );
    }
}

class anj {
    
}


public class TypeCheck_Cast {
    public static void main(String[] args) {
        
        sayHello(new Manager("Fero"));  
        sayHello(new Vice("Fera"));  
        sayHello(new Employe("Fere"));  
        
          
        long a = 120;
        
        int b = (int) a;
        
        a = b;
        
//    Ketika child akses parent harus di casting    
        Vice v = (Vice) new Employe("asd");
//    ketika parent akses child tidak perlu dicasting
        Employe e = new Vice("asde");
        
    }
    
    static void sayHello(Employe e) {
        if(e instanceof Manager) {
            Manager m = (Manager) e;
            System.out.println("Halo Manager " + m.name);
        } else if(e instanceof Vice) {
            Vice v = (Vice) e;
            System.out.println("Halo Vp " + v.name);
        } else{
            System.out.println("Halo" + e.name);
        }
    }

    Child c = new Child();
    
    Parent p = c;
    
    Parent pp = new Parent();
    
    Child ca = (Child) pp;

    
    
}

class Parent {
    
}

class Child extends Parent {
    
}
