/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coba;

class Carr{
    String name = "Carr";
    
    void run() {
        System.out.println("method from super class");
    }
    
    
    
}

class Bmw extends Carr{
    String name = "bmw";
    
    void run() {
        System.out.println("method from subclas");
    }
    
    
}
public class OveridingDanHdiding {
    public static void main(String[] args) {
        Bmw b = new Bmw();
//    variabel hiding akan mengakses kelas berdasar tipe data kelas tersebut
//    mthod overiding akan mengakses berdasarkan instansiate objek
        System.out.println(b.name);
        b.run();
        
        
        Carr c = new Bmw();
//    ketika menggunakan polimorphisme method overiding akan mengakses
//    berdasarkan instansiate objek
        c.run();
//    ketika mengguakan polimorfisme juga variable hiding akan mengakses
//    berdasarkan tipe data kelas / nama kelas tidak pengaruh instansiate
//    objek
        System.out.println(c.name);
        
    }
}
