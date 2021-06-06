/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Equals_Overide;


public class EqualsOveride {
    
    
    
    
    public static void main(String[] args) {
        
        EqualsOveride e = new EqualsOveride();
        EqualsOveride o = new EqualsOveride();
        
//    e == o / ini akan membandingkan memori diobjek bukanya valuenya
//    (membandandingkan referensinya)
        int addres = e.hashCode();
        System.out.println(Integer.toHexString(addres));
        addres = o.hashCode();
        System.out.println(Integer.toHexString(addres));
        
//     overide method equals
        
        
        
        
        
        
        
        
//        if(b == 1)
//            System.out.println("bener");
//        else 
//            System.out.println("salah");
        
    }
    
}
