/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anonymous;

/**
 *
 * @author Feri Winarta
 */
public class Anonymous {
    public static void main(String[] args) {

//   tidak dapat instansiate objek dari interface
//   Phone p = new Phone();

//   contoh penggunaan dari anonymous class
        Phone p = new Phone() {
            
            public void powerOn() {
                System.out.println("hp menyala");
            }

            public void powerOf() {
                System.out.println("hp mati");
            }

            public void maxSound() {    
                System.out.println("suara : 100");
            }
            
        };
        
        p.powerOn();
        p.maxSound();
        p.powerOf();
       
        
    }
}


