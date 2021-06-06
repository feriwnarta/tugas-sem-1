/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalClass_FinalMethod;

//final
class Avanza {
    private final String merek = "Toyota";
    private String[]lokDealer;
    
    public final void showMerek() {
        System.out.println("brand : " + merek);
    }
}

class Avanza1 extends Avanza {
    
//    tidak bisa mengoveride karena method merek diset final 
//    public void showMerek() {
//        
//    }
}



//eror tidak bisa inherit
//class Avanza1 extends Avanza {
//    
//}

public class Main {
    public static void main(String[] args) {
        
//    final hanya berguna agar kelas tidak bisa diturunkan bukanya
//    diinsasiate
        Avanza a = new Avanza();
        a.showMerek();
        
     
        
        
        
    }
}
