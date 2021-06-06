/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

class Employe {
    protected String name;
    private int salary;
    
    Employe(String name) {
        this.name = name;
    }
    
    void setSalary(int salary) {
        this.salary = salary;
    }
    
    void sayHi() {
        System.out.println("Halo saya adalah seorang employe " + name );
    }
    
    void showSalary() {
        System.out.println(this.salary);
    }
    
}

class Vice extends Employe {
    
    byte ruang;
    
    Vice(String name) {
        super(name);
    }
    
    void sayHi() {
        System.out.println("Halo saya adalah seorang vice " + super.name );
    }
    
    void setRuang(byte a) {
        ruang = a;
    }
    
    
}

public class Main {
    public static void main(String[] args) {
        Employe e = new Employe("Sunandar");
        e.sayHi();
        e.setSalary(20);
        
        e = new Vice("sandir");
        e.sayHi();
        e.setSalary(50);
        
        
        Vice v = new Vice("sander");
        sayGaji(v,20);
//     polimorfisme dapat berubah bentuk dan hanya memanggil method atau atribute yang sudh
//     di overwrite / override / shadowing
//     polimorfisme sangat erat dengan inheritance / pewarisan
//     kelas child tidak bisa mempoli kelas super
//     kelas super bisa mempoli kelas child dengan syarat method atau atribute overwrite
        setRuang(v);
        
        poliSuper(new Employe("sander"),12);
        
        poliSuper(new Vice("sandere"),13);
        
        
    }
    
    static void poliSuper(Employe e,int a) {
        e.setSalary(a);
        e.showSalary();
    }
    
    static void poliChild(Vice v) {
        byte b = 12;
        v.setRuang(b);
    }
    
    static void sayHai(Employe e) {
        System.out.println("Halo " + e.name);
    }
    
    static void sayGaji(Employe e, int a) {
        e.setSalary(a);
    }
    
    static void setRuang(Vice v) {
        byte b = 12;
        v.setRuang(b);
    }
}
