/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Anotation;

/**
 *
 * @author Feri Winarta
 */
public interface Facny {
//    static void sayHI() {
//        
//    }
//    
//    static void say() {
//        System.out.println("tes");
//    }
    
    void test();
    
    void test2();
    
    default void test3() {
        System.out.println("default method");
    }
}
